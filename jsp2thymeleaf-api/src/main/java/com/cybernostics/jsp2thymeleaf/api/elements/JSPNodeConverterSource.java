/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cybernostics.jsp2thymeleaf.api.elements;

import com.cybernostics.jsp.parser.JSPParser;
import java.util.Optional;

public interface JSPNodeConverterSource
{

    Optional<JSPElementNodeConverter> converterFor(JSPParser.JspElementContext JSPNode);

}
