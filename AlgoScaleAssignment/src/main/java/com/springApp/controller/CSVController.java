package com.springApp.controller;

import java.io.Reader;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.springApp.model.CSVModelData;

@Controller
@RequestMapping()
public class CSVController {
	
	public static final String SAMPLE_XLSX_FILE_PATH = "C:\\Users\\subhr\\Desktop\\generalnumber.csv";

	@GetMapping("/")
	public String showHome(ModelMap theModel) {
		CSVModelData csvUser;
		try (
				Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_XLSX_FILE_PATH));
		){
			@SuppressWarnings({ "unchecked", "rawtypes" })
			CsvToBean<CSVModelData> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(CSVModelData.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

			Iterator<CSVModelData> csvUserIterator = csvToBean.iterator();
			String[] tickers=new String[454];
			String[] companys=new String[500];
			String [] previousClose = new String[454];
			int t=0,c=0,p=0;
			
			while(csvUserIterator.hasNext()) {
				csvUser  = csvUserIterator.next();	
				tickers[t++] =  csvUser.getTicker();
				companys[c++] = csvUser.getCompany();
				previousClose[p++]=csvUser.getPreviousClose(); 
				//theModel.addAttribute("datas",csvUser.getTicker());
				
				//System.out.println("Ticker: "+csvUser.getTicker());
				//System.out.println("Company : "+csvUser.getCompany());
				//System.out.println("Industry : "+csvUser.getIndustry());
				//System.out.println("Previous closed  : "+csvUser.getPreviousClose());
				
			}
//			List<CSVModelData> users = csvToBean.parse();
//			
//			for (CSVModelData user : users) {
//				System.out.println(user.getTicker());
//				System.out.println(user.getCompany());
//			}
						
			System.out.println();
			//theModel.addAttribute("PreviousClose", previousClose);
			theModel.addAttribute("tickers", tickers);
			theModel.addAttribute("companys",Arrays.asList(companys));
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return "home";
	}
	
	
}
