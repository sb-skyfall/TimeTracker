package com.shubham.demo.controller;



import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shubham.demo.model.EmployeeRecord;
import com.shubham.demo.service.MyService;

@Controller
public class MyController {

    //Save the uploaded file to this folder
    private static String UPLOADED_FOLDER = "F://temp//";
    @Autowired
    MyService myService;

    @GetMapping("/upload")
    public String index() {
        return "index";
    }

    @PostMapping("/upload") // //new annotation since 4.3
    public String singleFileUpload( EmployeeRecord record,
                                   RedirectAttributes redirectAttributes) {

        try {

            // Get the file and save it somewhere
           myService.logTime(record);

//            redirectAttributes.addFlashAttribute("message",
//                    "You successfully uploaded '" + tr.getFile().getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/uploadStatus";
    }

    @GetMapping("/uploadStatus")
    public String uploadStatus() {
        return "uploadStatus";
    }

}