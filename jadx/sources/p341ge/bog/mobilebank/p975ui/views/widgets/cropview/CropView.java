package p341ge.bog.mobilebank.p975ui.views.widgets.cropview;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.cropview.subscaleview.ImageSource;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cropview.CropView */
public class CropView extends FrameLayout {
    private C35792a cropPhotoImageView;
    private boolean oval;

    public CropView(Context context, boolean z) {
        super(context);
        this.oval = z;
        init();
    }

    private void init() {
        this.cropPhotoImageView = new C35792a(getContext(), this.oval);
        this.cropPhotoImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.cropPhotoImageView);
        C35793b bVar = new C35793b(getContext(), this.oval);
        bVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(bVar);
    }

    public Bitmap getCropBitmap() {
        return this.cropPhotoImageView.mo87644M();
    }

    public void setImage(int i) {
        this.cropPhotoImageView.setImage(ImageSource.resource(i));
    }

    public void setImage(String str) {
        this.cropPhotoImageView.setImage(ImageSource.uri(str).tilingEnabled());
    }

    public CropView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}
