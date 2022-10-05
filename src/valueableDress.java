public class valueableDress extends outfitDecorator{
    public valueableDress(dressable clothes) {
        super(clothes);
    }
    @Override
    public void collecting() {
        super.collecting();
        System.out.println("Adding Valuable Dress Features");
    }
}
