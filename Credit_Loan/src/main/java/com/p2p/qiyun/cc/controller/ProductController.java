package com.p2p.qiyun.cc.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.p2p.qiyun.cc.pojo.Product;
import com.p2p.qiyun.cc.service.ProductService;



@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	//查询所有用户
    @RequestMapping("list")
    public List<Product> listUser(Integer pid){
    	pid=8;
       List<Product> list = service.list(pid);
        
        System.out.println(list);
        return list;
    }
    
    @RequestMapping("addProduct")
    public String fileUpload(MultipartFile fileyi,MultipartFile fileer,Product product, ModelMap map) throws IOException {

        
        //图片上传成功后，将图片的地址写到数据库
        String filePath = "E:\\upload";//保存图片的路径
        //获取原始图片的拓展名
        String originalFilenameyi = fileyi.getOriginalFilename();
        String originalFilenameer = fileer.getOriginalFilename();
        //新的文件名字
        String newFileNameyi = UUID.randomUUID()+originalFilenameyi;
        String newFileNameer = UUID.randomUUID()+originalFilenameer;
        //封装上传文件位置的全路径
        File targetFileyi = new File(filePath,newFileNameyi); 
        File targetFileer = new File(filePath,newFileNameer); 
        //把本地文件上传到封装上传文件位置的全路径
        fileyi.transferTo(targetFileyi);
        fileer.transferTo(targetFileer);
        product.setPimageyi(filePath+'\\'+newFileNameyi);
        product.setPimageer(filePath+'\\'+newFileNameer);
        
       service.save(product.getPimageyi(), product.getPimageer());
        return "redirect:/list"; 
    }
}
