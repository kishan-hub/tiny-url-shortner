package com.kishanprime.tinyurlshortner.service;

/**
 * @author Nasim Salmany
 */
public interface IdConverterService {

    String encode(long num);

    long decode(String shortenKey);
}
