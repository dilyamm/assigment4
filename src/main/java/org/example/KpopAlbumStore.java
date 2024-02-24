public class KpopAlbumStore {
    public static void main(String[] args) {
        AlbumFactory skzAlbumFactory = new SKZalbumFactory();
        Album skzAlbum = skzAlbumFactory.createAlbum();
        skzAlbum.displayAlbumInfo();

        AlbumFactory twsAlbumFactory = new TWSlbumFactory(); // Corrected typo here
        Album twsAlbum = twsAlbumFactory.createAlbum();
        twsAlbum.displayAlbumInfo();
    }
}
