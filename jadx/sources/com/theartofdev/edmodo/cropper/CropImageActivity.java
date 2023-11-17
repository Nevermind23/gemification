package com.theartofdev.edmodo.cropper;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.C0209a;
import androidx.appcompat.app.C0218d;
import androidx.core.content.C0767a;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import java.io.IOException;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p571qe.C17491b;
import p571qe.C17492c;
import p571qe.C17493d;
import p571qe.C17494e;

public class CropImageActivity extends C0218d implements CropImageView.C11855i, CropImageView.C11851e {

    /* renamed from: n */
    private CropImageView f34448n;

    /* renamed from: o */
    private Uri f34449o;

    /* renamed from: p */
    private CropImageOptions f34450p;

    /* renamed from: U0 */
    private void m43373U0(Menu menu, int i, int i2) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                icon.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (Exception e) {
                Log.w("AIC", "Failed to update menu item color", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo31750O0() {
        if (this.f34450p.f34465O) {
            mo31754S0((Uri) null, (Exception) null, 1);
            return;
        }
        Uri P0 = mo31751P0();
        CropImageView cropImageView = this.f34448n;
        CropImageOptions cropImageOptions = this.f34450p;
        cropImageView.mo31795r(P0, cropImageOptions.f34460J, cropImageOptions.f34461K, cropImageOptions.f34462L, cropImageOptions.f34463M, cropImageOptions.f34464N);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public Uri mo31751P0() {
        String str;
        Uri uri = this.f34450p.f34459I;
        if (uri != null && !uri.equals(Uri.EMPTY)) {
            return uri;
        }
        try {
            Bitmap.CompressFormat compressFormat = this.f34450p.f34460J;
            if (compressFormat == Bitmap.CompressFormat.JPEG) {
                str = ".jpg";
            } else if (compressFormat == Bitmap.CompressFormat.PNG) {
                str = ".png";
            } else {
                str = ".webp";
            }
            return Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
        } catch (IOException e) {
            throw new RuntimeException("Failed to create temp file for output image", e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public Intent mo31752Q0(Uri uri, Exception exc, int i) {
        CropImage.ActivityResult activityResult = new CropImage.ActivityResult(this.f34448n.getImageUri(), uri, exc, this.f34448n.getCropPoints(), this.f34448n.getCropRect(), this.f34448n.getRotatedDegrees(), this.f34448n.getWholeImageRect(), i);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", activityResult);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo31753R0(int i) {
        this.f34448n.mo31793p(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public void mo31754S0(Uri uri, Exception exc, int i) {
        int i2;
        if (exc == null) {
            i2 = -1;
        } else {
            i2 = 204;
        }
        setResult(i2, mo31752Q0(uri, exc, i));
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public void mo31755T0() {
        setResult(0);
        finish();
    }

    /* renamed from: i0 */
    public void mo31756i0(CropImageView cropImageView, Uri uri, Exception exc) {
        if (exc == null) {
            Rect rect = this.f34450p.f34466P;
            if (rect != null) {
                this.f34448n.setCropRect(rect);
            }
            int i = this.f34450p.f34467Q;
            if (i > -1) {
                this.f34448n.setRotatedDegrees(i);
                return;
            }
            return;
        }
        mo31754S0((Uri) null, exc, 1);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 200) {
            if (i2 == 0) {
                mo31755T0();
            }
            if (i2 == -1) {
                Uri f = CropImage.m43365f(this, intent);
                this.f34449o = f;
                if (CropImage.m43368i(this, f)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, BogInputLayout.INPUT_ERROR_STATE);
                } else {
                    this.f34448n.setImageUriAsync(this.f34449o);
                }
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        mo31755T0();
    }

    public void onCreate(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onCreate(bundle);
        setContentView(C17492c.crop_image_activity);
        this.f34448n = (CropImageView) findViewById(C17491b.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.f34449o = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
        this.f34450p = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        if (bundle == null) {
            Uri uri = this.f34449o;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                if (CropImage.m43367h(this)) {
                    requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
                } else {
                    CropImage.m43370k(this);
                }
            } else if (CropImage.m43368i(this, this.f34449o)) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, BogInputLayout.INPUT_ERROR_STATE);
            } else {
                this.f34448n.setImageUriAsync(this.f34449o);
            }
        }
        C0209a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions = this.f34450p;
            if (cropImageOptions == null || (charSequence2 = cropImageOptions.f34457G) == null || charSequence2.length() <= 0) {
                charSequence = getResources().getString(C17494e.crop_image_activity_title);
            } else {
                charSequence = this.f34450p.f34457G;
            }
            supportActionBar.mo550A(charSequence);
            supportActionBar.mo565s(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C17493d.crop_image_menu, menu);
        CropImageOptions cropImageOptions = this.f34450p;
        if (!cropImageOptions.f34468R) {
            menu.removeItem(C17491b.crop_image_menu_rotate_left);
            menu.removeItem(C17491b.crop_image_menu_rotate_right);
        } else if (cropImageOptions.f34470T) {
            menu.findItem(C17491b.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.f34450p.f34469S) {
            menu.removeItem(C17491b.crop_image_menu_flip);
        }
        if (this.f34450p.f34474X != null) {
            menu.findItem(C17491b.crop_image_menu_crop).setTitle(this.f34450p.f34474X);
        }
        Drawable drawable = null;
        try {
            int i = this.f34450p.f34475Y;
            if (i != 0) {
                drawable = C0767a.m2895e(this, i);
                menu.findItem(C17491b.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception e) {
            Log.w("AIC", "Failed to read menu crop drawable", e);
        }
        int i2 = this.f34450p.f34458H;
        if (i2 != 0) {
            m43373U0(menu, C17491b.crop_image_menu_rotate_left, i2);
            m43373U0(menu, C17491b.crop_image_menu_rotate_right, this.f34450p.f34458H);
            m43373U0(menu, C17491b.crop_image_menu_flip, this.f34450p.f34458H);
            if (drawable != null) {
                m43373U0(menu, C17491b.crop_image_menu_crop, this.f34450p.f34458H);
            }
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == C17491b.crop_image_menu_crop) {
            mo31750O0();
            return true;
        } else if (menuItem.getItemId() == C17491b.crop_image_menu_rotate_left) {
            mo31753R0(-this.f34450p.f34471U);
            return true;
        } else if (menuItem.getItemId() == C17491b.crop_image_menu_rotate_right) {
            mo31753R0(this.f34450p.f34471U);
            return true;
        } else if (menuItem.getItemId() == C17491b.crop_image_menu_flip_horizontally) {
            this.f34448n.mo31767f();
            return true;
        } else if (menuItem.getItemId() == C17491b.crop_image_menu_flip_vertically) {
            this.f34448n.mo31768g();
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            mo31755T0();
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 201) {
            Uri uri = this.f34449o;
            if (uri == null || iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, C17494e.crop_image_activity_no_permissions, 1).show();
                mo31755T0();
            } else {
                this.f34448n.setImageUriAsync(uri);
            }
        }
        if (i == 2011) {
            CropImage.m43370k(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f34448n.setOnSetImageUriCompleteListener(this);
        this.f34448n.setOnCropImageCompleteListener(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f34448n.setOnSetImageUriCompleteListener((CropImageView.C11855i) null);
        this.f34448n.setOnCropImageCompleteListener((CropImageView.C11851e) null);
    }

    /* renamed from: t */
    public void mo31759t(CropImageView cropImageView, CropImageView.C11848b bVar) {
        mo31754S0(bVar.mo31828h(), bVar.mo31824d(), bVar.mo31827g());
    }
}
