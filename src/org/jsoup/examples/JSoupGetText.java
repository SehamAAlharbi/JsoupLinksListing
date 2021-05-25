package org.jsoup.examples;

import org.jsoup.Jsoup;

import java.io.File;
import java.io.IOException;

public class JSoupGetText {

    public void getText () throws IOException{

        var fileName = "register.html";
        var myFile = new File(fileName);

        var doc = Jsoup.parse(myFile, "UTF-8");

        System.out.println(doc.text());

        System.out.println("---------------------------");
        System.out.println(doc.body().text());

        System.out.println("---------------------------");
        var e1 = doc.select("body>p").first();
        System.out.println(e1.text());

        System.out.println("---------------------------");
        var e2 = doc.select("body>ul").first();
        System.out.println(e2.text());

        System.out.println("---------------------------");
        var lis = e2.children();
        System.out.println(lis.first().text());
        System.out.println(lis.last().text());
    }
}
