public class Country {
    private String name;
    private int numberOfStates;
    private State[] states;
    private String PrimeMinister;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getNumberOfStates() {
        return numberOfStates;
    }
    public void setNumberOfStates(int numberOfStates) {
        this.numberOfStates = numberOfStates;
    }
    public String getPrimeMinister() {
        return PrimeMinister;
    }
    public void setPrimeMinister(String primeMinister) {
        PrimeMinister = primeMinister;
    }
    public void setStates(State[] states){
        this.states=states;
    }
    public State[] getStates(){
        return states;
    }
}