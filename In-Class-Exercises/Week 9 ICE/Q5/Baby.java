public class Baby {
    private boolean isHungry;

    public void setIsHungry(boolean value) {
        isHungry = value;
    }
    public void eat(String description) throws NotHungryException{
        if (isHungry) {
            System.out.println("eating "+ description);
        } else {
            throw new NotHungryException("rejects " + description);
        }
    }
}
