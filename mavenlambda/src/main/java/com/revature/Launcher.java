package com.revature;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Launcher implements RequestHandler<Object, String> {
    public String handleRequest(Object o, Context Context) {
        return "Hello from Lambda!!";
    }
}
