package Models;

/**
 * This class us used for constructing the month appointment model
 * for report controller.
 */
public class REPORT_StateProvince_TotalCustomer {
    /**
     * variables used in report model
     */
    private String state;
    private int totCus;

    /**
     * constructor for month model
     */
    public REPORT_StateProvince_TotalCustomer(String state, int totCus) {
        this.state = state;
        this.totCus = totCus;
    }

    /**
     * getter/setter methods
     */

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * set state
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * return customer total for state
     * @return
     */
    public int getTotCus() {
        return totCus;
    }

    /**
     * set customer total for state
     * @param totCus
     */
    public void setTotCus(int totCus) {
        this.totCus = totCus;
    }
}
