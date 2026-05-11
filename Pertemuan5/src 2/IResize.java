public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menambah ukuran sesuai dengan input persen yang diberikan
    public void zoom(int percent);
}
