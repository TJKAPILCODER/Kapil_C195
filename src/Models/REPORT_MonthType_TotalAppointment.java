package Models;

/**
 * Through this class we can construct an appointment model for month type
 * this is to be used in report controller.
 */
public class REPORT_MonthType_TotalAppointment {
    /**
     * variables to be used in class
     */
        private String appointmentMonth;
        private String appointmentType;
        private int totMonth;

        /**
         * Constructor for report month
         */
        public REPORT_MonthType_TotalAppointment(String appointmentMonth, String appointmentType, int totalPerMonth) {
                this.appointmentMonth = appointmentMonth;
                this.appointmentType = appointmentType;
                this.totMonth = totalPerMonth;
        }

    /**
     * getter/setter methods
     */

    /**
     * @return appointment month
     */
    public String getAppointmentMonth() {
        return appointmentMonth;
    }

    /**
     * set appointment month
     * @param appointmentMonth
     */
    public void setAppointmentMonth(String appointmentMonth) {
        this.appointmentMonth = appointmentMonth;
    }

    /**
     * return appointment type
     * @return
     */
    public String getAppointmentType() {
        return appointmentType;
    }

    /**
     * set appointment type
     * @param appointmentType
     */
    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }

    /**
     * get appointments per month
     * @return
     */
    public int getTotalPerMonth() {
        return totMonth;
    }

    /**
     * set appointments per month
     * @param totalPerMonth
     */
    public void setTotalPerMonth(int totalPerMonth) {
        this.totMonth = totalPerMonth;
    }
}

