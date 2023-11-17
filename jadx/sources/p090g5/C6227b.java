package p090g5;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: g5.b */
public class C6227b extends Fragment {

    /* renamed from: d */
    private C6226a f19251d;

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f19251d.mo19833f(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f19251d = new C6226a(this);
    }

    public void onResume() {
        super.onResume();
        this.f19251d.mo19834g();
    }
}
