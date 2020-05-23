package com.kishanprime.tinyurlshortner.service;


import java.util.Optional;

import com.kishanprime.tinyurlshortner.entities.ShortenUrl;

/**
 * @author Nasim Salmany
 */
public interface ShortenUrlService {

    String shortenUrl(String originalUrl);

    Optional<ShortenUrl> getShortenUrl(String shortenKey);
}
