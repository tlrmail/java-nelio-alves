package com.udemy.java_completo_2023_poo;

import java.net.IDN;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class EncodeUrl {
    public static void main(String[] args) throws MalformedURLException {

        String q = "!#learn_java_language";
        URL urlToEncode = new URL("https://www.google.com/search?q=" + q);

        try {
            URI uri = new URI(urlToEncode.getProtocol(),
                    urlToEncode.getUserInfo(),
                    IDN.toASCII(urlToEncode.getHost()),
                    urlToEncode.getPort(),
                    urlToEncode.getPath(),
                    urlToEncode.getQuery(), urlToEncode.getRef());

            String finalEncodedUrl = uri.toASCIIString();
            System.out.println("Encoded Url: " + finalEncodedUrl);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }


}