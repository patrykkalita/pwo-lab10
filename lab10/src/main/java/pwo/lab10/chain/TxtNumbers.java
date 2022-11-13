package pwo.lab10.chain;

import static pwo.lab10.chain.TxtProcReverse.ACTION;

public class TxtNumbers extends TxtProc{
    
    public static String ACTION = "NUMBERS";
    
    
    @Override
    public String processRequest(Request request) {
        if (request.action.toUpperCase().equals(ACTION)) {
            return request.text.replaceAll("[0-9]","");
        } else {
            return next(request);
        }
    }
}
