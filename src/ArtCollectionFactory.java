public class ArtCollectionFactory extends CollectionFactory{
    @Override
    public Collection findCollection() {
        System.out.println("Sending Art collection...");
        return new ArtCollection();
    }
}
