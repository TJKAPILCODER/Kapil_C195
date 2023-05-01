package Models;

/**
 * This class is used for customer the customer model
 */
public class CustomerModel {
    /**
     * variables used in class
     */
    private int cusID;
    private String cus_Name;
    private String cus_Add;
    private String cus_PosCode;
    private String cus_phoneNum;
    private int cus_stateId;
    private int cus_conID;
    private String cus_StateName;
    private String cus_CountryName;

    /**
     * Constructor for customer model
     */
    public CustomerModel(int cusID, String cus_Name, String cus_Add, String cus_PosCode, String cus_phoneNum, int cus_stateId, int cus_conID, String cus_StateName, String cus_CountryName) {
        this.cusID = cusID;
        this.cus_Name = cus_Name;
        this.cus_Add = cus_Add;
        this.cus_PosCode = cus_PosCode;
        this.cus_phoneNum = cus_phoneNum;
        this.cus_stateId = cus_stateId;
        this.cus_conID = cus_conID;
        this.cus_StateName = cus_StateName;
        this.cus_CountryName = cus_CountryName;
    }

    /**
     * Constructor #2
     */
    public CustomerModel(int cusID, String cus_Name, String cus_Add, String cus_PosCode, String cus_phoneNum, int cus_stateId, int cus_conID) {
        this.cusID = cusID;
        this.cus_Name = cus_Name;
        this.cus_Add = cus_Add;
        this.cus_PosCode = cus_PosCode;
        this.cus_phoneNum = cus_phoneNum;
        this.cus_stateId = cus_stateId;
        this.cus_conID = cus_conID;
    }

    /**
     * Constructor #3
     */
    public CustomerModel(int cusID, String cus_Name) {
        this.cusID = cusID;
        this.cus_Name = cus_Name;
    }

    /**
     * getter/setter methods
     */
    public CustomerModel(){}

    /**
     *
     * @return customer id
     */
    public int getCusID() {
        return cusID;
    }

    /**
     * set customer id
     * @param cusID
     */
    public void setCusID(int cusID) {
        this.cusID = cusID;
    }

    /**
     *
     * @return customer name
     */
    public String getCus_Name() {
        return cus_Name;
    }

    /**
     * set customer name
     * @param cus_Name
     */
    public void setCus_Name(String cus_Name) {
        this.cus_Name = cus_Name;
    }

    /**
     *
     * @return customer id
     */
    public String getCus_Add() {
        return cus_Add;
    }

    /**
     * set customer id
     * @param cus_Add
     */
    public void setCus_Add(String cus_Add) {
        this.cus_Add = cus_Add;
    }

    /**
     * return customer postal code
     * @return
     */
    public String getCus_PosCode() {
        return cus_PosCode;
    }

    /**
     * set customer postal code
     * @param cus_PosCode
     */
    public void setCus_PosCode(String cus_PosCode) {
        this.cus_PosCode = cus_PosCode;
    }

    /**
     *
     * @return customer phone
     */
    public String getCus_phoneNum() {
        return cus_phoneNum;
    }

    /**
     * set customer phone
     * @param cus_phoneNum
     */
    public void setCus_phoneNum(String cus_phoneNum) {
        this.cus_phoneNum = cus_phoneNum;
    }

    /**
     *
     * @return customer state id
     */
    public int getCus_stateId() {
        return cus_stateId;
    }

    /**
     * set customer state id
     * @param cus_stateId
     */
    public void setCus_stateId(int cus_stateId) {
        this.cus_stateId = cus_stateId;
    }

    /**
     *
     * @return customer id
     */
    public int getCus_conID() {
        return cus_conID;
    }

    /**
     * set customer con id
     * @param cus_conID
     */
    public void setCus_conID(int cus_conID) {
        this.cus_conID = cus_conID;
    }

    /**
     *
     * @return customer state name
     */
    public String getCus_StateName() {
        return cus_StateName;
    }

    /**
     * set customer state name
     * @param cus_StateName
     */
    public void setCus_StateName(String cus_StateName) {
        this.cus_StateName = cus_StateName;
    }

    /**
     *
     * @return customer country name
     */
    public String getCus_CountryName() {
        return cus_CountryName;
    }

    /**
     * set customer country name
     * @param cus_CountryName
     */
    public void setCus_CountryName(String cus_CountryName) {
        this.cus_CountryName = cus_CountryName;
    }

    /**
     * return customer id concatenated with name
     */
    @Override
    public String toString() {
        String result = Integer.toString(cusID) + " " + cus_Name;
        return result;
    }
}
