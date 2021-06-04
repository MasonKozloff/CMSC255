/*
 * Art.java
 *
 * Programming Project 6 – Apartment Buildings
 *Mason Kozloff
 *5/5/21
 * 255 CMSC
 */

package Project7;

public class Art {
    /**
     * member variables
     * name
     * creator
     * value
     * location
     *
     */

    private String name;
    private String creator;
    private double value;
    private String location;

    /**
     *
     * constructor with no argument
     *
     */
    public Art(){
        this.name="";
        this.creator="";
        this.value=0;
        this.location="";
    }

    /**
     *
     * @param _name
     * @param _creator
     * @param _value
     * @param _location
     *
     * @return void
     */

    public Art(String _name,String _creator,double _value,String _location){
        this.name=_name;
        this.creator=_creator;
        this.value=_value;
        this.location=_location;
    }

    /**
     * @return ret
     */
    public String toString(){
        String ret="";
        ret+=this.name;
        ret+=" ";
        ret+=this.creator;
        ret+=" ";
        ret+=this.value;
        ret+=" ";
        ret+=this.location;

        return ret;
    }

    /**
     *@param obj
     *
     * @return true/false
     */

    public boolean equals(Object obj){
        Art art=(Art) obj;
        if(this.name.equals(art.getName()) && this.creator.equals(this.getCreator())){

            return true;
        }
        return false;
    }


    /**
     *
     * @return location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return value
     */
    public double getValue() {
        return value;
    }

    /**
     *
     * @param value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     *
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    /**
     *
     * @param creator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}