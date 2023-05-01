package Models;

/**
 * Through this class we construct the state province model.
 */
public class StateProvinceModel {

    private int stateId;
    private String stateName;
    private int countryId;

    /**
     * Constructor for state province model.
     */
    public StateProvinceModel(int stateId, String stateName, int countryId) {
        this.stateId = stateId;
        this.stateName = stateName;
        this.countryId = countryId;
    }
    /**
     * second constructor. for id and name
     */
    public StateProvinceModel(int stateId, String stateName) {
        this.stateId = stateId;
        this.stateName = stateName;
    }

    /**
     * Getter/Setter methods
     */

    /**
     *
     * @return stateId
     */
    public int getStateId() {
        return stateId;
    }

    /**
     * set state id
     * @param stateId
     */
    public void setStateId(int stateId) {
        this.stateId = stateId;
    }

    /**
     *
     * @return state name
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * set state name
     * @param stateName
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     *
     * @return country id
     */
    public int getCountryId() {
        return countryId;
    }

    /**
     * set country id
     * @param countryId
     */
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    /**
     * return state name as string
     */
    @Override
    public String toString() {
        String result = stateName;
        return result;
    }

}
