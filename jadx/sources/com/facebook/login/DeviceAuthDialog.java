package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C1483c;
import com.facebook.AccessToken;
import com.facebook.C2625c;
import com.facebook.C2626d;
import com.facebook.C2639f;
import com.facebook.C2642h;
import com.facebook.C2643i;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p115i4.C6564m;
import p258t4.C8365b;
import p258t4.C8366c;
import p258t4.C8367d;
import p258t4.C8368e;
import p284v4.C8700a;
import p297w4.C8769a0;
import p297w4.C8775b0;
import p297w4.C8819n;
import p297w4.C8846w;
import p334z4.C9207a;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

public class DeviceAuthDialog extends C1483c {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public volatile RequestState f8285A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Dialog f8286B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f8287C = false;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public boolean f8288D = false;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public LoginClient.Request f8289E = null;

    /* renamed from: t */
    private View f8290t;

    /* renamed from: u */
    private TextView f8291u;

    /* renamed from: v */
    private TextView f8292v;

    /* renamed from: w */
    private DeviceAuthMethodHandler f8293w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public AtomicBoolean f8294x = new AtomicBoolean();

    /* renamed from: y */
    private volatile C2639f f8295y;

    /* renamed from: z */
    private volatile ScheduledFuture f8296z;

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C2648a();

        /* renamed from: d */
        private String f8297d;

        /* renamed from: e */
        private String f8298e;

        /* renamed from: f */
        private String f8299f;

        /* renamed from: g */
        private long f8300g;

        /* renamed from: h */
        private long f8301h;

        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        static class C2648a implements Parcelable.Creator {
            C2648a() {
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
            this.f8297d = parcel.readString();
            this.f8298e = parcel.readString();
            this.f8299f = parcel.readString();
            this.f8300g = parcel.readLong();
            this.f8301h = parcel.readLong();
        }

        /* renamed from: a */
        public String mo8312a() {
            return this.f8297d;
        }

        /* renamed from: b */
        public long mo8313b() {
            return this.f8300g;
        }

        /* renamed from: d */
        public String mo8314d() {
            return this.f8299f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public String mo8316e() {
            return this.f8298e;
        }

        /* renamed from: f */
        public void mo8317f(long j) {
            this.f8300g = j;
        }

        /* renamed from: g */
        public void mo8318g(long j) {
            this.f8301h = j;
        }

        /* renamed from: h */
        public void mo8319h(String str) {
            this.f8299f = str;
        }

        /* renamed from: i */
        public void mo8320i(String str) {
            this.f8298e = str;
            this.f8297d = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        /* renamed from: j */
        public boolean mo8321j() {
            if (this.f8301h != 0 && (new Date().getTime() - this.f8301h) - (this.f8300g * 1000) < 0) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f8297d);
            parcel.writeString(this.f8298e);
            parcel.writeString(this.f8299f);
            parcel.writeLong(this.f8300g);
            parcel.writeLong(this.f8301h);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$a */
    class C2649a implements GraphRequest.C2612e {
        C2649a() {
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            if (!DeviceAuthDialog.this.f8287C) {
                if (hVar.mo8279g() != null) {
                    DeviceAuthDialog.this.mo8310T1(hVar.mo8279g().mo8164g());
                    return;
                }
                JSONObject h = hVar.mo8280h();
                RequestState requestState = new RequestState();
                try {
                    requestState.mo8320i(h.getString("user_code"));
                    requestState.mo8319h(h.getString("code"));
                    requestState.mo8317f(h.getLong("interval"));
                    DeviceAuthDialog.this.m10238Y1(requestState);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.mo8310T1(new FacebookException((Throwable) e));
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$b */
    class C2650b implements View.OnClickListener {
        C2650b() {
        }

        public void onClick(View view) {
            if (!C9207a.m34024c(this)) {
                try {
                    DeviceAuthDialog.this.mo8309S1();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$c */
    class C2651c implements Runnable {
        C2651c() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    DeviceAuthDialog.this.m10235V1();
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$d */
    class C2652d implements GraphRequest.C2612e {
        C2652d() {
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            if (!DeviceAuthDialog.this.f8294x.get()) {
                FacebookRequestError g = hVar.mo8279g();
                if (g != null) {
                    int i = g.mo8166i();
                    if (i != 1349152) {
                        switch (i) {
                            case 1349172:
                            case 1349174:
                                DeviceAuthDialog.this.m10237X1();
                                return;
                            case 1349173:
                                DeviceAuthDialog.this.mo8309S1();
                                return;
                            default:
                                DeviceAuthDialog.this.mo8310T1(hVar.mo8279g().mo8164g());
                                return;
                        }
                    } else {
                        if (DeviceAuthDialog.this.f8285A != null) {
                            C8700a.m32442a(DeviceAuthDialog.this.f8285A.mo8316e());
                        }
                        if (DeviceAuthDialog.this.f8289E != null) {
                            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                            deviceAuthDialog.mo8311Z1(deviceAuthDialog.f8289E);
                            return;
                        }
                        DeviceAuthDialog.this.mo8309S1();
                    }
                } else {
                    try {
                        JSONObject h = hVar.mo8280h();
                        DeviceAuthDialog.this.m10234U1(h.getString("access_token"), Long.valueOf(h.getLong("expires_in")), Long.valueOf(h.optLong("data_access_expiration_time")));
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.mo8310T1(new FacebookException((Throwable) e));
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$e */
    class C2653e implements DialogInterface.OnClickListener {
        C2653e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.f8286B.setContentView(DeviceAuthDialog.this.mo8308R1(false));
            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
            deviceAuthDialog.mo8311Z1(deviceAuthDialog.f8289E);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$f */
    class C2654f implements DialogInterface.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ String f8307d;

        /* renamed from: e */
        final /* synthetic */ C8769a0.C8773d f8308e;

        /* renamed from: f */
        final /* synthetic */ String f8309f;

        /* renamed from: g */
        final /* synthetic */ Date f8310g;

        /* renamed from: h */
        final /* synthetic */ Date f8311h;

        C2654f(String str, C8769a0.C8773d dVar, String str2, Date date, Date date2) {
            this.f8307d = str;
            this.f8308e = dVar;
            this.f8309f = str2;
            this.f8310g = date;
            this.f8311h = date2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.m10232O1(this.f8307d, this.f8308e, this.f8309f, this.f8310g, this.f8311h);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$g */
    class C2655g implements GraphRequest.C2612e {

        /* renamed from: a */
        final /* synthetic */ String f8313a;

        /* renamed from: b */
        final /* synthetic */ Date f8314b;

        /* renamed from: c */
        final /* synthetic */ Date f8315c;

        C2655g(String str, Date date, Date date2) {
            this.f8313a = str;
            this.f8314b = date;
            this.f8315c = date2;
        }

        /* renamed from: a */
        public void mo107a(C2642h hVar) {
            if (!DeviceAuthDialog.this.f8294x.get()) {
                if (hVar.mo8279g() != null) {
                    DeviceAuthDialog.this.mo8310T1(hVar.mo8279g().mo8164g());
                    return;
                }
                try {
                    JSONObject h = hVar.mo8280h();
                    String string = h.getString("id");
                    C8769a0.C8773d E = C8769a0.m32632E(h);
                    String string2 = h.getString("name");
                    C8700a.m32442a(DeviceAuthDialog.this.f8285A.mo8316e());
                    if (!C8819n.m32843j(C2626d.m10135f()).mo24248k().contains(C8846w.RequireConfirm) || DeviceAuthDialog.this.f8288D) {
                        DeviceAuthDialog.this.m10232O1(string, E, this.f8313a, this.f8314b, this.f8315c);
                        return;
                    }
                    boolean unused = DeviceAuthDialog.this.f8288D = true;
                    DeviceAuthDialog.this.m10236W1(string, E, this.f8313a, string2, this.f8314b, this.f8315c);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.mo8310T1(new FacebookException((Throwable) e));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public void m10232O1(String str, C8769a0.C8773d dVar, String str2, Date date, Date date2) {
        this.f8293w.mo8335v(str2, C2626d.m10135f(), str, dVar.mo24185c(), dVar.mo24183a(), dVar.mo24184b(), C2625c.DEVICE_AUTH, date, (Date) null, date2);
        this.f8286B.dismiss();
    }

    /* renamed from: Q1 */
    private GraphRequest m10233Q1() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f8285A.mo8314d());
        return new GraphRequest((AccessToken) null, "device/login_status", bundle, C2643i.POST, new C2652d());
    }

    /* access modifiers changed from: private */
    /* renamed from: U1 */
    public void m10234U1(String str, Long l, Long l2) {
        Date date;
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date2 = null;
        if (l.longValue() != 0) {
            date = new Date(new Date().getTime() + (l.longValue() * 1000));
        } else {
            date = null;
        }
        if (l2.longValue() != 0) {
            date2 = new Date(l2.longValue() * 1000);
        }
        new GraphRequest(new AccessToken(str, C2626d.m10135f(), BankApiResponse.SUCCESSFUL_RESPONSE_CODE, (Collection) null, (Collection) null, (Collection) null, (C2625c) null, date, (Date) null, date2), "me", bundle, C2643i.GET, new C2655g(str, date, date2)).mo8185i();
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public void m10235V1() {
        this.f8285A.mo8318g(new Date().getTime());
        this.f8295y = m10233Q1().mo8185i();
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public void m10236W1(String str, C8769a0.C8773d dVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(C8367d.com_facebook_smart_login_confirmation_title);
        String string2 = getResources().getString(C8367d.com_facebook_smart_login_confirmation_continue_as);
        String string3 = getResources().getString(C8367d.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new C2654f(str, dVar, str2, date, date2)).setPositiveButton(string3, new C2653e());
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: X1 */
    public void m10237X1() {
        this.f8296z = DeviceAuthMethodHandler.m10259s().schedule(new C2651c(), this.f8285A.mo8313b(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y1 */
    public void m10238Y1(RequestState requestState) {
        this.f8285A = requestState;
        this.f8291u.setText(requestState.mo8316e());
        this.f8292v.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), C8700a.m32444c(requestState.mo8312a())), (Drawable) null, (Drawable) null);
        this.f8291u.setVisibility(0);
        this.f8290t.setVisibility(8);
        if (!this.f8288D && C8700a.m32447f(requestState.mo8316e())) {
            new C6564m(getContext()).mo20550i("fb_smart_login_service");
        }
        if (requestState.mo8321j()) {
            m10237X1();
        } else {
            m10235V1();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: P1 */
    public int mo8307P1(boolean z) {
        return z ? C8366c.com_facebook_smart_device_dialog_fragment : C8366c.com_facebook_device_auth_dialog_fragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R1 */
    public View mo8308R1(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(mo8307P1(z), (ViewGroup) null);
        this.f8290t = inflate.findViewById(C8365b.f23777f);
        this.f8291u = (TextView) inflate.findViewById(C8365b.confirmation_code);
        ((Button) inflate.findViewById(C8365b.f23776a)).setOnClickListener(new C2650b());
        TextView textView = (TextView) inflate.findViewById(C8365b.com_facebook_device_auth_instructions);
        this.f8292v = textView;
        textView.setText(Html.fromHtml(getString(C8367d.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S1 */
    public void mo8309S1() {
        if (this.f8294x.compareAndSet(false, true)) {
            if (this.f8285A != null) {
                C8700a.m32442a(this.f8285A.mo8316e());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f8293w;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.mo8333t();
            }
            this.f8286B.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: T1 */
    public void mo8310T1(FacebookException facebookException) {
        if (this.f8294x.compareAndSet(false, true)) {
            if (this.f8285A != null) {
                C8700a.m32442a(this.f8285A.mo8316e());
            }
            this.f8293w.mo8334u(facebookException);
            this.f8286B.dismiss();
        }
    }

    /* renamed from: Z1 */
    public void mo8311Z1(LoginClient.Request request) {
        this.f8289E = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.mo8392i()));
        String g = request.mo8390g();
        if (g != null) {
            bundle.putString("redirect_uri", g);
        }
        String f = request.mo8389f();
        if (f != null) {
            bundle.putString("target_user_id", f);
        }
        bundle.putString("access_token", C8775b0.m32709b() + "|" + C8775b0.m32710c());
        bundle.putString("device_info", C8700a.m32445d());
        new GraphRequest((AccessToken) null, "device/login", bundle, C2643i.POST, new C2649a()).mo8185i();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f8293w = (DeviceAuthMethodHandler) ((C2675e) ((FacebookActivity) getActivity()).mo8154M0()).mo8446k1().mo8375k();
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            m10238Y1(requestState);
        }
        return onCreateView;
    }

    public void onDestroyView() {
        this.f8287C = true;
        this.f8294x.set(true);
        super.onDestroyView();
        if (this.f8295y != null) {
            this.f8295y.cancel(true);
        }
        if (this.f8296z != null) {
            this.f8296z.cancel(true);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f8287C) {
            mo8309S1();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f8285A != null) {
            bundle.putParcelable("request_state", this.f8285A);
        }
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        boolean z;
        this.f8286B = new Dialog(getActivity(), C8368e.com_facebook_auth_dialog);
        if (!C8700a.m32446e() || this.f8288D) {
            z = false;
        } else {
            z = true;
        }
        this.f8286B.setContentView(mo8308R1(z));
        return this.f8286B;
    }
}
