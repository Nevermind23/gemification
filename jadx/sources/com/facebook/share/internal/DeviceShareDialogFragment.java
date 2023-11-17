package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1505h;
import com.facebook.AccessToken;
import com.facebook.C2642h;
import com.facebook.C2643i;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p258t4.C8365b;
import p258t4.C8366c;
import p258t4.C8367d;
import p258t4.C8368e;
import p284v4.C8700a;
import p297w4.C8775b0;
import p334z4.C9207a;

@Deprecated
public class DeviceShareDialogFragment extends C1483c {

    /* renamed from: z */
    private static ScheduledThreadPoolExecutor f8435z;

    /* renamed from: t */
    private ProgressBar f8436t;

    /* renamed from: u */
    private TextView f8437u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public Dialog f8438v;

    /* renamed from: w */
    private volatile RequestState f8439w;

    /* renamed from: x */
    private volatile ScheduledFuture f8440x;

    /* renamed from: y */
    private ShareContent f8441y;

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C2689a();

        /* renamed from: d */
        private String f8442d;

        /* renamed from: e */
        private long f8443e;

        /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$RequestState$a */
        static class C2689a implements Parcelable.Creator {
            C2689a() {
            }

            /* renamed from: a */
            public RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            /* renamed from: b */
            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        }

        RequestState() {
        }

        protected RequestState(Parcel parcel) {
            this.f8442d = parcel.readString();
            this.f8443e = parcel.readLong();
        }

        /* renamed from: a */
        public long mo8472a() {
            return this.f8443e;
        }

        /* renamed from: b */
        public String mo8473b() {
            return this.f8442d;
        }

        /* renamed from: d */
        public void mo8474d(long j) {
            this.f8443e = j;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public void mo8476e(String str) {
            this.f8442d = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8442d);
            parcel.writeLong(this.f8443e);
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$a */
    class C2690a implements View.OnClickListener {
        C2690a() {
        }

        public void onClick(View view) {
            if (!C9207a.m34024c(this)) {
                try {
                    DeviceShareDialogFragment.this.f8438v.dismiss();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$b */
    class C2691b implements GraphRequest.C2612e {
        C2691b() {
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            FacebookRequestError g = hVar.mo8279g();
            if (g != null) {
                DeviceShareDialogFragment.this.m10459G1(g);
                return;
            }
            JSONObject h = hVar.mo8280h();
            RequestState requestState = new RequestState();
            try {
                requestState.mo8476e(h.getString("user_code"));
                requestState.mo8474d(h.getLong("expires_in"));
                DeviceShareDialogFragment.this.m10462J1(requestState);
            } catch (JSONException unused) {
                DeviceShareDialogFragment.this.m10459G1(new FacebookRequestError(0, "", "Malformed server response"));
            }
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$c */
    class C2692c implements Runnable {
        C2692c() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    DeviceShareDialogFragment.this.f8438v.dismiss();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: E1 */
    private void m10457E1() {
        if (isAdded()) {
            getFragmentManager().mo4428p().mo4522q(this).mo4515i();
        }
    }

    /* renamed from: F1 */
    private void m10458F1(int i, Intent intent) {
        if (this.f8439w != null) {
            C8700a.m32442a(this.f8439w.mo8473b());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.mo8162e(), 0).show();
        }
        if (isAdded()) {
            C1505h activity = getActivity();
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public void m10459G1(FacebookRequestError facebookRequestError) {
        m10457E1();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m10458F1(-1, intent);
    }

    /* renamed from: H1 */
    private static synchronized ScheduledThreadPoolExecutor m10460H1() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f8435z == null) {
                f8435z = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f8435z;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: I1 */
    private Bundle m10461I1() {
        ShareContent shareContent = this.f8441y;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return C2699c.m10489a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return C2699c.m10490b((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public void m10462J1(RequestState requestState) {
        this.f8439w = requestState;
        this.f8437u.setText(requestState.mo8473b());
        this.f8437u.setVisibility(0);
        this.f8436t.setVisibility(8);
        this.f8440x = m10460H1().schedule(new C2692c(), requestState.mo8472a(), TimeUnit.SECONDS);
    }

    /* renamed from: L1 */
    private void m10463L1() {
        Bundle I1 = m10461I1();
        if (I1 == null || I1.size() == 0) {
            m10459G1(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        I1.putString("access_token", C8775b0.m32709b() + "|" + C8775b0.m32710c());
        I1.putString("device_info", C8700a.m32445d());
        new GraphRequest((AccessToken) null, "device/share", I1, C2643i.POST, new C2691b()).mo8185i();
    }

    /* renamed from: K1 */
    public void mo8471K1(ShareContent shareContent) {
        this.f8441y = shareContent;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            m10462J1(requestState);
        }
        return onCreateView;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f8440x != null) {
            this.f8440x.cancel(true);
        }
        m10458F1(-1, new Intent());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f8439w != null) {
            bundle.putParcelable("request_state", this.f8439w);
        }
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        this.f8438v = new Dialog(getActivity(), C8368e.com_facebook_auth_dialog);
        View inflate = getActivity().getLayoutInflater().inflate(C8366c.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.f8436t = (ProgressBar) inflate.findViewById(C8365b.f23777f);
        this.f8437u = (TextView) inflate.findViewById(C8365b.confirmation_code);
        ((Button) inflate.findViewById(C8365b.f23776a)).setOnClickListener(new C2690a());
        ((TextView) inflate.findViewById(C8365b.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(C8367d.com_facebook_device_auth_instructions)));
        this.f8438v.setContentView(inflate);
        m10463L1();
        return this.f8438v;
    }
}
