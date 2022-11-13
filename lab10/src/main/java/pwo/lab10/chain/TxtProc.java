package pwo.lab10.chain;

public class TxtProc implements Request.RequestHandler {

    protected TxtProc next = null;

    public void add(TxtProc txtProc) {
        if (next == null) {
            next = txtProc;
        } else {
            next.add(txtProc);
        }
    }

    protected String next(Request request) {
        if (next != null) {
            return next.processRequest(request);
        } else {
            return null;
        }
    }

    @Override
    public String processRequest(Request request) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
