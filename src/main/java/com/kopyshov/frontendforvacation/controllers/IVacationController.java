package com.kopyshov.frontendforvacation.controllers;

import org.thymeleaf.ITemplateEngine;
import org.thymeleaf.web.IWebExchange;

import java.io.Writer;

public interface IVacationController {
    void process(final IWebExchange webExchange, final ITemplateEngine templateEngine, final Writer writer)
            throws Exception;
}
