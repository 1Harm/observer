public class outfitDecorator implements dressable  {
    protected dressable dress;

    public outfitDecorator(dressable clothes) {
        this.dress = clothes;
    }

    @Override
    public void collecting() {
        this.dress.collecting();
    }
}

