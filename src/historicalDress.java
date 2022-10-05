public class historicalDress extends outfitDecorator
{

    public historicalDress(dressable clothes) {
        super(clothes);
    }
    @Override
    public void collecting() {
        super.collecting();
        System.out.println("Adding Historical Dress Features");
    }
}
