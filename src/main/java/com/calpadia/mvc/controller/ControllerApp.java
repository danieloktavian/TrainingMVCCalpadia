package com.calpadia.mvc.controller;

import com.calpadia.mvc.model.Karyawan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel Oktavian Duha
 */

@Controller
public class ControllerApp {

    @RequestMapping("")
    public String indexPage(Model model) {
        model.addAttribute("data", "Selamat Datang di Java & Spring");
        return "index";
    }

    @RequestMapping("karyawan")
    public String karyawanPage(Model model) {
        model.addAttribute("data", "Selamat Datang di Java & Spring");
        model.addAttribute("nama", "Daniel");


       /* List<String> namaKaryawan = new ArrayList<>();
        namaKaryawan.add("Daniel");
        namaKaryawan.add("Dio");
        namaKaryawan.add("Fachri");
        namaKaryawan.add("Habil");
        namaKaryawan.add("Febri");

        model.addAttribute("listNama", namaKaryawan);*/


        Karyawan Habil = new Karyawan();
        Habil.setNama("Habil");
        Habil.setNIK("1234");
        Habil.setUmur("24");
        Habil.setGaji(35);

        Karyawan Fachri = new Karyawan();
        Fachri.setNama("Fachri");
        Fachri.setNIK("4321");
        Fachri.setUmur("30");
        Fachri.setGaji(30);

        List<Karyawan> karyawanList = new ArrayList<>();
        karyawanList.add(Habil);
        karyawanList.add(Fachri);

        model.addAttribute("karyawanList", karyawanList);

        return "karyawan/karyawan";
    }


    @RequestMapping("karyawan/add")
    public String tambahPage(Model model) {
        Karyawan karyawan = new Karyawan();
        model.addAttribute("karyawan", karyawan);
        return "karyawan/tambah";
    }

    @RequestMapping(value = "karyawan/tambah", method = RequestMethod.POST)
    @ResponseBody
    public String tambahKaryawan(@ModelAttribute("karyawan") Karyawan karyawan) {
        System.out.println(karyawan.toString());
        return "<h1>Berhasil</h1>";
    }

    @RequestMapping("karyawan/{id}")
    @ResponseBody
    public String getParameter(@PathVariable("id") String id) {
        return "<h1>" + id + "</h1>";
    }

    @RequestMapping("karyawan/parameter")
    @ResponseBody
    public String getParam(@RequestParam("id") String id) {
        return "<h1>" + id + "</h1>";
    }
}
