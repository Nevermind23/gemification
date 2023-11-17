package com.otaliastudios.cameraview;

public class CameraException extends RuntimeException {

    /* renamed from: d */
    private int f32659d;

    public CameraException(Throwable th, int i) {
        super(th);
        this.f32659d = i;
    }

    /* renamed from: a */
    public int mo29314a() {
        return this.f32659d;
    }

    /* renamed from: b */
    public boolean mo29315b() {
        int a = mo29314a();
        return a == 1 || a == 2 || a == 3;
    }

    public CameraException(int i) {
        this.f32659d = i;
    }
}
