class TWSlbumFactory implements AlbumFactory {
    @Override
    public Album createAlbum() {
        return new TWSalbum();
    }
}