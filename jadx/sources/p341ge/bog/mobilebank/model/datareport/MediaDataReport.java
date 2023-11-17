package p341ge.bog.mobilebank.model.datareport;

/* renamed from: ge.bog.mobilebank.model.datareport.MediaDataReport */
public class MediaDataReport {
    private long deviceFreeMemorySize;
    private long deviceMemorySize;
    private int downloadedMediaFilesCount;
    private long pictureSizeInGallery;
    private int picturesCountInGallery;

    public void setDeviceFreeMemorySize(long j) {
        this.deviceFreeMemorySize = j;
    }

    public void setDeviceMemorySize(long j) {
        this.deviceMemorySize = j;
    }

    public void setDownloadedMediaFilesCount(int i) {
        this.downloadedMediaFilesCount = i;
    }

    public void setPictureSizeInGallery(long j) {
        this.pictureSizeInGallery = j;
    }

    public void setPicturesCountInGallery(int i) {
        this.picturesCountInGallery = i;
    }

    public String toString() {
        return "MediaDataReport{downloadedMediaFilesCount=" + this.downloadedMediaFilesCount + ", deviceMemorySize=" + this.deviceMemorySize + ", deviceFreeMemorySize=" + this.deviceFreeMemorySize + ", picturesCountInGallery=" + this.picturesCountInGallery + ", pictureSizeInGallery=" + this.pictureSizeInGallery + '}';
    }
}
