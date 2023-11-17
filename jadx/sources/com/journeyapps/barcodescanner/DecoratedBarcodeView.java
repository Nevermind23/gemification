package com.journeyapps.barcodescanner;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.zxing.C5759i;
import com.google.zxing.C5766o;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p174mb.C7158f;
import p174mb.C7159g;
import p174mb.C7165k;
import p174mb.C7166l;
import p174mb.C7169o;
import p416fd.C12843a;
import p416fd.C12844b;
import p416fd.C12849g;
import p416fd.C12854j;
import p430gd.C12978i;

public class DecoratedBarcodeView extends FrameLayout {

    /* renamed from: d */
    private BarcodeView f30336d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ViewfinderView f30337e;

    /* renamed from: f */
    private TextView f30338f;

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$a */
    public interface C10647a {
    }

    /* renamed from: com.journeyapps.barcodescanner.DecoratedBarcodeView$b */
    private class C10648b implements C12843a {

        /* renamed from: a */
        private C12843a f30339a;

        public C10648b(C12843a aVar) {
            this.f30339a = aVar;
        }

        /* renamed from: a */
        public void mo27407a(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DecoratedBarcodeView.this.f30337e.mo27409a((C5766o) it.next());
            }
            this.f30339a.mo27407a(list);
        }

        /* renamed from: b */
        public void mo27408b(C12844b bVar) {
            this.f30339a.mo27408b(bVar);
        }
    }

    public DecoratedBarcodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m38815d(attributeSet);
    }

    /* renamed from: d */
    private void m38815d(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C7169o.f21223t);
        int resourceId = obtainStyledAttributes.getResourceId(C7169o.f21224u, C7166l.zxing_barcode_scanner);
        obtainStyledAttributes.recycle();
        View.inflate(getContext(), resourceId, this);
        BarcodeView barcodeView = (BarcodeView) findViewById(C7165k.zxing_barcode_surface);
        this.f30336d = barcodeView;
        if (barcodeView != null) {
            barcodeView.mo27436q(attributeSet);
            ViewfinderView viewfinderView = (ViewfinderView) findViewById(C7165k.zxing_viewfinder_view);
            this.f30337e = viewfinderView;
            if (viewfinderView != null) {
                viewfinderView.setCameraPreview(this.f30336d);
                this.f30338f = (TextView) findViewById(C7165k.zxing_status_view);
                return;
            }
            throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.ViewfinderView on provided layout with the id \"zxing_viewfinder_view\".");
        }
        throw new IllegalArgumentException("There is no a com.journeyapps.barcodescanner.BarcodeView on provided layout with the id \"zxing_barcode_surface\".");
    }

    /* renamed from: b */
    public void mo27389b(C12843a aVar) {
        this.f30336d.mo27373I(new C10648b(aVar));
    }

    /* renamed from: c */
    public void mo27390c(C12843a aVar) {
        this.f30336d.mo27374J(new C10648b(aVar));
    }

    /* renamed from: e */
    public void mo27391e(Intent intent) {
        int intExtra;
        Set a = C7158f.m27540a(intent);
        Map a2 = C7159g.m27542a(intent);
        C12978i iVar = new C12978i();
        if (intent.hasExtra("SCAN_CAMERA_ID") && (intExtra = intent.getIntExtra("SCAN_CAMERA_ID", -1)) >= 0) {
            iVar.mo33771i(intExtra);
        }
        if (intent.hasExtra("TORCH_ENABLED") && intent.getBooleanExtra("TORCH_ENABLED", false)) {
            mo27401j();
        }
        String stringExtra = intent.getStringExtra("PROMPT_MESSAGE");
        if (stringExtra != null) {
            setStatusText(stringExtra);
        }
        int intExtra2 = intent.getIntExtra("SCAN_TYPE", 0);
        String stringExtra2 = intent.getStringExtra("CHARACTER_SET");
        new C5759i().mo18890f(a2);
        this.f30336d.setCameraSettings(iVar);
        this.f30336d.setDecoderFactory(new C12854j(a, a2, stringExtra2, intExtra2));
    }

    /* renamed from: f */
    public void mo27392f() {
        this.f30336d.mo27378u();
    }

    /* renamed from: g */
    public void mo27393g() {
        this.f30336d.mo27446v();
    }

    public BarcodeView getBarcodeView() {
        return (BarcodeView) findViewById(C7165k.zxing_barcode_surface);
    }

    public C12978i getCameraSettings() {
        return this.f30336d.getCameraSettings();
    }

    public C12849g getDecoderFactory() {
        return this.f30336d.getDecoderFactory();
    }

    public TextView getStatusView() {
        return this.f30338f;
    }

    public ViewfinderView getViewFinder() {
        return this.f30337e;
    }

    /* renamed from: h */
    public void mo27399h() {
        this.f30336d.mo27447y();
    }

    /* renamed from: i */
    public void mo27400i() {
        this.f30336d.setTorch(false);
    }

    /* renamed from: j */
    public void mo27401j() {
        this.f30336d.setTorch(true);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            mo27401j();
            return true;
        } else if (i == 25) {
            mo27400i();
            return true;
        } else if (i == 27 || i == 80) {
            return true;
        } else {
            return super.onKeyDown(i, keyEvent);
        }
    }

    public void setCameraSettings(C12978i iVar) {
        this.f30336d.setCameraSettings(iVar);
    }

    public void setDecoderFactory(C12849g gVar) {
        this.f30336d.setDecoderFactory(gVar);
    }

    public void setStatusText(String str) {
        TextView textView = this.f30338f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTorchListener(C10647a aVar) {
    }
}
