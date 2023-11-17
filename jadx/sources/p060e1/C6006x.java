package p060e1;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: e1.x */
abstract class C6006x {

    /* renamed from: a */
    static final Matrix f18753a = new C6007a();

    /* renamed from: e1.x$a */
    class C6007a extends Matrix {
        C6007a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo19453a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public boolean postConcat(Matrix matrix) {
            mo19453a();
            return false;
        }

        public boolean postRotate(float f, float f2, float f3) {
            mo19453a();
            return false;
        }

        public boolean postScale(float f, float f2, float f3, float f4) {
            mo19453a();
            return false;
        }

        public boolean postSkew(float f, float f2, float f3, float f4) {
            mo19453a();
            return false;
        }

        public boolean postTranslate(float f, float f2) {
            mo19453a();
            return false;
        }

        public boolean preConcat(Matrix matrix) {
            mo19453a();
            return false;
        }

        public boolean preRotate(float f, float f2, float f3) {
            mo19453a();
            return false;
        }

        public boolean preScale(float f, float f2, float f3, float f4) {
            mo19453a();
            return false;
        }

        public boolean preSkew(float f, float f2, float f3, float f4) {
            mo19453a();
            return false;
        }

        public boolean preTranslate(float f, float f2) {
            mo19453a();
            return false;
        }

        public void reset() {
            mo19453a();
        }

        public void set(Matrix matrix) {
            mo19453a();
        }

        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            mo19453a();
            return false;
        }

        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            mo19453a();
            return false;
        }

        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            mo19453a();
            return false;
        }

        public void setRotate(float f, float f2, float f3) {
            mo19453a();
        }

        public void setScale(float f, float f2, float f3, float f4) {
            mo19453a();
        }

        public void setSinCos(float f, float f2, float f3, float f4) {
            mo19453a();
        }

        public void setSkew(float f, float f2, float f3, float f4) {
            mo19453a();
        }

        public void setTranslate(float f, float f2) {
            mo19453a();
        }

        public void setValues(float[] fArr) {
            mo19453a();
        }

        public boolean postRotate(float f) {
            mo19453a();
            return false;
        }

        public boolean postScale(float f, float f2) {
            mo19453a();
            return false;
        }

        public boolean postSkew(float f, float f2) {
            mo19453a();
            return false;
        }

        public boolean preRotate(float f) {
            mo19453a();
            return false;
        }

        public boolean preScale(float f, float f2) {
            mo19453a();
            return false;
        }

        public boolean preSkew(float f, float f2) {
            mo19453a();
            return false;
        }

        public void setRotate(float f) {
            mo19453a();
        }

        public void setScale(float f, float f2) {
            mo19453a();
        }

        public void setSinCos(float f, float f2) {
            mo19453a();
        }

        public void setSkew(float f, float f2) {
            mo19453a();
        }
    }
}
