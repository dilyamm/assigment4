class SKZalbumFactory implements AlbumFactory {
    @Override
    public Album createAlbum() {
        return new SKZalbum();
    }
}