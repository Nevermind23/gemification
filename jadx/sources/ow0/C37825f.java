package ow0;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import g91.C32297d;
import g91.C32315k0;
import g91.C32359z0;
import iu0.C36546y;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nw0.C37490e;
import p341ge.bog.mobilebank.eventbus.events.DeleteTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTemplateEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.PensionStatusResult;
import p341ge.bog.mobilebank.model.payment.PaymentProviderConfiguration;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.model.template.TemplateBasketParameter;
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.PaymentCustomConfiguration;
import p341ge.bog.mobilebank.payment.model.PaymentCustomParameter;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.BogUrlHelper;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p366bk.C10328q;
import pw0.C38025a;
import q81.C38163b;
import qw0.C38256d;
import qw0.C38258f;
import rw0.C38375b;

/* renamed from: ow0.f */
public class C37825f extends C37821b implements C37490e {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C38163b f90791A = null;

    /* renamed from: n */
    private final ArrayList f90792n;

    /* renamed from: o */
    private final int f90793o;

    /* renamed from: p */
    private boolean f90794p;

    /* renamed from: q */
    private Long f90795q;

    /* renamed from: r */
    private boolean f90796r;

    /* renamed from: s */
    private long f90797s;

    /* renamed from: t */
    private boolean f90798t;

    /* renamed from: u */
    private TemplateFormActivity f90799u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public TemplateBasketItem f90800v;

    /* renamed from: w */
    private PaymentProviderConfiguration f90801w;

    /* renamed from: x */
    private boolean f90802x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public File f90803y;

    /* renamed from: z */
    private String f90804z;

    /* renamed from: ow0.f$a */
    class C37826a implements View.OnClickListener {
        C37826a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m111209c() {
            C37825f.this.f90803y = null;
            C37825f.this.f90800v.setRemoveImage(true);
            C37825f.this.mo91076r().mo79630j3(C37825f.this.f90803y, C32359z0.m95557a0(C10328q.common_text_upload_image));
            C37825f.this.mo91076r().mo79613J2(C37825f.this.mo91074n());
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m111210d(DialogInterface dialogInterface) {
            C37825f.this.f90791A = null;
        }

        public void onClick(View view) {
            if (C37825f.this.f90800v.getTemplateImage() == null && C37825f.this.f90803y == null) {
                C37825f.this.f90791A = new C38163b(C37825f.this.mo91076r());
                C37825f.this.f90791A.show();
                return;
            }
            C37825f.this.f90791A = new C38163b(C37825f.this.mo91076r(), new int[]{1, 2, 3});
            C37825f.this.f90791A.mo91690j(new Runnable[]{null, new C37823d(this)});
            C37825f.this.f90791A.setOnDismissListener(new C37824e(this));
            C37825f.this.f90791A.show();
        }
    }

    /* renamed from: ow0.f$b */
    class C37827b implements Runnable {

        /* renamed from: d */
        final /* synthetic */ ModifyTemplateEvent f90806d;

        C37827b(ModifyTemplateEvent modifyTemplateEvent) {
            this.f90806d = modifyTemplateEvent;
        }

        public void run() {
            Intent intent = new Intent();
            intent.putExtra("TEMPLATE_ITEM_ID", String.valueOf(this.f90806d.getTemplate().getId()));
            TemplateFormActivity V = C37825f.this.mo91076r();
            C37825f.this.mo91076r();
            V.setResult(-1, intent);
            C37825f.this.mo91076r().finish();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37825f(TemplateFormActivity templateFormActivity, String str, boolean z, boolean z2, long j, boolean z3, long j2, boolean z4, String str2, String str3, ArrayList arrayList, int i) {
        super(templateFormActivity, str, z, str2, (String) null, (String) null, (String) null, (String) null);
        boolean z5 = z2;
        long j3 = j2;
        Long l = null;
        this.f90794p = z5;
        this.f90795q = j != -1 ? Long.valueOf(j) : l;
        this.f90796r = z3;
        this.f90797s = j3;
        this.f90798t = z4;
        this.f90799u = templateFormActivity;
        this.f90804z = str3;
        this.f90792n = arrayList;
        this.f90793o = i;
        this.f90775e.setIsTemplate(true);
        C38258f fVar = new C38258f(this);
        fVar.mo91800e(z5);
        fVar.mo91801f(j3);
        C38256d dVar = this.f90776f;
        fVar.f91747h = dVar.f91747h;
        dVar.mo91796d();
        this.f90776f = fVar;
        fVar.mo91795c();
    }

    /* renamed from: Q */
    private void m111180Q(List list, List list2) {
        TemplateBasketParameter templateBasketParameter;
        if (this.f90775e.getSelectedPackageConfig() != null) {
            templateBasketParameter = new TemplateBasketParameter();
            templateBasketParameter.setParameterKey("bog_package_id");
            templateBasketParameter.setParameterType(PensionStatusResult.STATUS_ACTIVE);
            templateBasketParameter.setParameterValue(this.f90775e.getSelectedPackageConfig().getId());
        } else {
            templateBasketParameter = null;
        }
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                TemplateBasketParameter templateBasketParameter2 = (TemplateBasketParameter) it.next();
                if (templateBasketParameter2.getParameterKey().equals("bog_package_id")) {
                    if (templateBasketParameter == null) {
                        templateBasketParameter2.setParameterValue((String) null);
                        templateBasketParameter = templateBasketParameter2;
                    } else {
                        templateBasketParameter.setId(templateBasketParameter2.getId());
                    }
                }
            }
        }
        if (templateBasketParameter != null) {
            list2.add(templateBasketParameter);
        }
    }

    /* renamed from: R */
    private void m111181R() {
        if (this.f90800v.canGetDebt() && this.f90800v.getTemplateDebtEvent() != null) {
            ((C38258f) this.f90776f).onTemplateDebt(this.f90800v);
        }
    }

    /* renamed from: T */
    private void m111182T() {
        List<TemplateBasketParameter> templateParameters = this.f90800v.getTemplateParameters();
        List X = m111184X();
        m111180Q(templateParameters, X);
        this.f90800v.setTemplateParameters(X);
        PaymentCustomParameter customParamByKey = this.f90775e.getCustomParamByKey("PROVIDER_LIST_ID");
        if (this.f90775e.isCompany() && customParamByKey != null) {
            this.f90800v.setServiceId(customParamByKey.getValue());
        }
        String valueToDisplay = this.f90775e.getParameters().get(0).getValueToDisplay();
        if (TextUtils.isEmpty(valueToDisplay)) {
            valueToDisplay = C38375b.m112718n(this.f90800v, this.f90801w);
        }
        this.f90800v.setTemplateName(valueToDisplay);
    }

    /* renamed from: U */
    private TemplateBasketItem m111183U() {
        TemplateBasketItem templateBasketItem = new TemplateBasketItem();
        templateBasketItem.setChannel(BogUrlHelper.getChannel(this.f90776f.mo91794b().isAuthorized()));
        templateBasketItem.setTemplateType("S");
        templateBasketItem.setTemplateParameters(new ArrayList());
        templateBasketItem.setServiceId(this.f90775e.getServiceId());
        PaymentCustomConfiguration paymentCustomConfiguration = this.f90775e;
        if (paymentCustomConfiguration != null) {
            templateBasketItem.setTemplateName(paymentCustomConfiguration.getName());
        }
        return templateBasketItem;
    }

    /* renamed from: X */
    private List m111184X() {
        ArrayList arrayList = new ArrayList();
        for (PaymentCustomParameter next : this.f90775e.getParameters()) {
            if (next.isMandatory() && !TextUtils.isEmpty(next.getId()) && !"TEMPLATE_NAME_ID".equals(next.getId()) && !"PHONE_INDEX_ID".equals(next.getId()) && !"PROVIDER_LIST_ID".equals(next.getId()) && !TextUtils.isEmpty(next.getValue())) {
                if (next.getStyle().getMask() == null) {
                    TemplateBasketParameter templateBasketParameter = new TemplateBasketParameter();
                    templateBasketParameter.setParameterKey(next.getId());
                    templateBasketParameter.setParameterType(PensionStatusResult.STATUS_ACTIVE);
                    templateBasketParameter.setParameterValue(next.getValue());
                    if (next.getId().equals("amount")) {
                        if (this.f90775e.isDebtVerifiable()) {
                            templateBasketParameter.setParameterValue(BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
                        } else {
                            templateBasketParameter.setParameterValue(String.valueOf(this.f90774d.multiply(new BigDecimal(100)).intValue()));
                        }
                    }
                    templateBasketParameter.setParameterIndex(next.getInputIndexInRawConfig());
                    mo91110d0(templateBasketParameter);
                    arrayList.add(templateBasketParameter);
                } else {
                    String[] split = C32315k0.m95264m(next.getValue(), next.getStyle().getMask(), true).split(String.format("\\%s", new Object[]{C32315k0.m95262k(next.getStyle().getMask())}));
                    if (split != null && split.length > 0) {
                        for (int i = 0; i < split.length; i++) {
                            TemplateBasketParameter templateBasketParameter2 = new TemplateBasketParameter();
                            templateBasketParameter2.setParameterValue(split[i]);
                            templateBasketParameter2.setParameterKey(next.getId());
                            templateBasketParameter2.setParameterType(PensionStatusResult.STATUS_ACTIVE);
                            templateBasketParameter2.setParameterIndex(i);
                            mo91110d0(templateBasketParameter2);
                            arrayList.add(templateBasketParameter2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: F */
    public void mo91085F() {
        if (this.f90794p) {
            this.f90800v = m111183U();
            if (this.f90775e.isCompany()) {
                mo91086G();
                mo91076r().mo79603Y2(this.f90775e.getParameters());
                mo91076r().mo79619Z2(this.f90775e.getName(), this.f90775e.getLogoUrl());
                mo91109c0(true);
                mo91076r().mo86425J1();
            } else {
                if (!TextUtils.isEmpty(this.f90771a)) {
                    this.f90776f.mo91794b().requestLastOperations(false, (Long) null, this.f90771a);
                }
                this.f90776f.mo91794b().requestPaymentsProviderConfig(true, "", this.f90775e.getServiceId(), this);
            }
        } else {
            if (this.f90804z != null) {
                TemplateBasketItem templateFromCarGroup = this.f90776f.mo91794b().getTemplateFromCarGroup(this.f90795q.longValue(), this.f90775e.getServiceId(), this.f90804z);
                this.f90800v = templateFromCarGroup;
                if (templateFromCarGroup != null) {
                    this.f90801w = this.f90776f.mo91794b().getTemplateBasketItemsWithConfig().getConfig().get(this.f90800v.getServiceId());
                    ((C38258f) this.f90776f).mo91801f(this.f90800v.getId());
                }
            } else {
                this.f90801w = this.f90776f.mo91794b().getPaymentConfigurationByTemplateId(this.f90797s);
                if (this.f90776f.mo91794b().getTemplateBasketItemsWithConfig() != null) {
                    this.f90800v = this.f90776f.mo91794b().getTemplateBasketItemsWithConfig().getTemplateBasketItemByTemplateId(this.f90797s);
                }
            }
            PaymentProviderConfiguration paymentProviderConfiguration = this.f90801w;
            if (paymentProviderConfiguration != null) {
                this.f90775e.setBaseConfiguration(paymentProviderConfiguration);
                this.f90775e = C38375b.m112708d(this.f90776f.f91743d, this.f90801w, this.f90775e, this.f90780j, this.f90800v);
                this.f90775e.setSelectedPackageIndex(this.f90801w.getServiceConfigJson(), C32315k0.m95267p(this.f90801w.getServiceConfigJson(), this.f90800v.getTemplateParameters()));
                mo91076r().mo79619Z2(this.f90775e.getName(), this.f90775e.getLogoUrl());
                mo91076r().mo79629i3(C38375b.m112718n(this.f90800v, this.f90801w), mo91104W());
                mo91087I();
                mo91109c0(this.f90798t);
                if (this.f90800v.canGetDebt()) {
                    m111181R();
                } else {
                    mo91076r().mo79603Y2(this.f90775e.getParameters());
                    mo91076r().mo86425J1();
                }
            }
        }
        TemplateBasketItem templateBasketItem = this.f90800v;
        if (templateBasketItem != null) {
            templateBasketItem.setRemoveImage(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo91086G() {
        super.mo91086G();
        PaymentCustomParameter o = C38375b.m112719o((TemplateBasketItem) null, (PaymentProviderConfiguration) null);
        this.f90775e.getParameters().get(0).setRowNum(1);
        this.f90775e.getParameters().add(0, o);
        this.f90775e.setIsTemplate(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo91067H() {
        mo91076r().mo79603Y2(this.f90775e.getParameters());
        mo91076r().mo79619Z2(this.f90775e.getName(), this.f90775e.getLogoUrl());
        if (this.f90802x) {
            mo91076r().mo79613J2(mo91074n());
        } else {
            mo91076r().mo79602X2(mo91093u(), mo91092t(), mo91074n());
        }
        if (this.f90775e.getResultListItems() == null || this.f90775e.getResultListItems().size() <= 0) {
            mo91076r().mo79615N2();
            this.f90779i = null;
        } else {
            this.f90779i = new C38025a(mo91076r(), this.f90776f.mo91794b(), this.f90775e.getResultListItems(), this.f90775e.getBaseConfiguration());
        }
        mo91076r().mo86425J1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo91088K() {
        mo91076r().mo79603Y2(this.f90775e.getParameters());
        mo91076r().mo86425J1();
    }

    /* renamed from: S */
    public void mo91102S() {
        this.f90776f.mo91794b().deleteTemplate(true, this.f90800v.getId());
    }

    /* renamed from: V */
    public TemplateFormActivity mo91076r() {
        return this.f90799u;
    }

    /* renamed from: W */
    public String mo91104W() {
        PaymentCustomConfiguration paymentCustomConfiguration;
        String m = C38375b.m112717m(this.f90800v);
        if (m != null || (paymentCustomConfiguration = this.f90775e) == null) {
            return m;
        }
        return paymentCustomConfiguration.getLogoUrl();
    }

    /* renamed from: Y */
    public void mo91105Y(int i, Intent intent) {
        C38163b bVar = this.f90791A;
        if (bVar != null) {
            bVar.mo91683c(i, intent);
        }
    }

    /* renamed from: Z */
    public boolean mo91106Z() {
        if (!this.f90802x || this.f90794p) {
            return false;
        }
        mo91109c0(false);
        return true;
    }

    /* renamed from: a */
    public void mo90631a(ModifyTemplateEvent modifyTemplateEvent) {
        Handler handler = new Handler();
        C32297d.m95160h(mo91076r(), C32359z0.m95557a0(C10328q.f28956f2));
        if (this.f90794p || this.f90796r) {
            handler.postDelayed(new C37827b(modifyTemplateEvent), 1500);
            return;
        }
        TemplateBasketItem template = modifyTemplateEvent.getTemplate();
        this.f90800v = template;
        if (template.isRemoveImage()) {
            this.f90800v.setTemplateImage((String) null);
            this.f90800v.setRemoveImage(false);
        }
        mo91109c0(false);
    }

    /* renamed from: a0 */
    public void mo91107a0(String str) {
        this.f90800v.setRemoveImage(false);
        this.f90803y = new File(str);
        mo91076r().mo79630j3(this.f90803y, C32359z0.m95557a0(C10328q.dialog_change_photo));
        mo91076r().mo79613J2(mo91074n());
    }

    /* renamed from: b */
    public void mo90632b(DeleteTemplateEvent deleteTemplateEvent) {
        mo91076r().mo86425J1();
        C32297d.m95160h(mo91076r(), C32359z0.m95557a0(C10328q.f28956f2));
        mo91076r().finish();
    }

    /* renamed from: b0 */
    public void mo91108b0(int i) {
        C38163b bVar = this.f90791A;
        if (bVar != null) {
            bVar.mo91684d(i);
        }
    }

    /* renamed from: c */
    public void mo90633c(TemplateBasketItem templateBasketItem) {
        this.f90800v = templateBasketItem;
        C38375b.m112706b(this.f90775e, templateBasketItem.getTemplateDebtEvent().getPaymentDebt(), true);
        mo91087I();
        mo91067H();
    }

    /* renamed from: c0 */
    public void mo91109c0(boolean z) {
        int i;
        this.f90802x = z;
        if (z) {
            mo91076r().mo79627g3();
            C37826a aVar = new C37826a();
            if (this.f90803y == null) {
                TemplateFormActivity V = mo91076r();
                String m = C38375b.m112717m(this.f90800v);
                C36546y N = C36546y.m108285N();
                if (this.f90800v.getLogo() == null) {
                    i = C10328q.common_text_upload_image;
                } else {
                    i = C10328q.dialog_change_photo;
                }
                V.mo79631k3(m, N.getString(i), aVar);
            } else {
                mo91076r().mo79630j3(this.f90803y, C36546y.m108285N().getString(C10328q.dialog_change_photo));
            }
            mo91076r().mo79633m3();
            mo91076r().mo79604a3(C32359z0.m95557a0(C10328q.button_text_save));
            mo91076r().mo79626f3();
        } else {
            mo91076r().mo79629i3(C38375b.m112718n(this.f90800v, this.f90801w), mo91104W());
            mo91076r().mo79632l3();
            mo91076r().mo79628h3();
            mo91076r().mo79602X2(mo91093u(), mo91092t(), mo91074n());
        }
        boolean z2 = false;
        this.f90775e.getParameters().get(0).setVisibleInForm(z);
        this.f90775e.getParameters().get(0).setVisibleInWizard(z);
        PaymentCustomParameter customParamByKey = this.f90775e.getCustomParamByKey("amount");
        if (customParamByKey != null) {
            if (!z || !this.f90775e.isDebtVerifiable() || this.f90775e.isMobile()) {
                z2 = true;
            }
            customParamByKey.setVisibleInForm(z2);
            customParamByKey.setVisibleInWizard(z2);
        }
        mo91076r().mo79603Y2(this.f90775e.getParameters());
        mo91076r().mo86425J1();
    }

    /* renamed from: d0 */
    public void mo91110d0(TemplateBasketParameter templateBasketParameter) {
        if (this.f90800v.getTemplateParameters() != null && this.f90800v.getTemplateParameters().size() > 0) {
            for (TemplateBasketParameter next : this.f90800v.getTemplateParameters()) {
                if (templateBasketParameter.getParameterKey().equals(next.getParameterKey()) && templateBasketParameter.getParameterIndex() == next.getParameterIndex()) {
                    templateBasketParameter.setId(next.getId());
                }
            }
        }
    }

    /* renamed from: n */
    public boolean mo91074n() {
        if (this.f90802x) {
            return mo91089l();
        }
        return super.mo91074n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo91090o() {
        if (this.f90775e.getResultListItems() != null || (this.f90775e.isDebtVerifiable() && this.f90802x)) {
            return false;
        }
        return true;
    }

    public void onDataError(String str) {
        this.f90777g.mo86425J1();
        C32297d.m95154b(mo91076r(), str);
    }

    public void onNetworkError() {
        this.f90777g.mo86425J1();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo91075q() {
        mo91076r().mo79619Z2(this.f90775e.getName(), this.f90775e.getLogoUrl());
        if (this.f90778h) {
            C38375b.m112716l(this.f90776f.f91746g.getOperationHistory().getParameters(), this.f90776f.mo91794b(), this.f90775e.getDebtServiceId(), this);
            return;
        }
        ArrayList arrayList = this.f90792n;
        if (arrayList != null) {
            C38375b.m112716l(C32315k0.m95254c(arrayList, this.f90775e.getBaseConfiguration().getServiceConfigJson()), this.f90776f.mo91794b(), this.f90775e.getDebtServiceId(), this);
            return;
        }
        mo91087I();
        mo91076r().mo79603Y2(this.f90775e.getParameters());
        mo91076r().mo79602X2(mo91093u(), mo91092t(), mo91074n());
        mo91076r().mo86425J1();
    }

    /* renamed from: y */
    public void mo91078y() {
        String str;
        if (this.f90802x) {
            mo91076r().mo86441o2();
            m111182T();
            Client b = this.f90776f.mo91794b();
            TemplateBasketItem templateBasketItem = this.f90800v;
            PaymentProviderConfiguration paymentProviderConfiguration = this.f90801w;
            File file = this.f90803y;
            Long l = this.f90795q;
            if (templateBasketItem.isRemoveImage()) {
                str = BankApi.OPERATION_KEY_REMOVE_IMAGE;
            } else {
                str = null;
            }
            b.modifyTemplate(true, templateBasketItem, paymentProviderConfiguration, file, l, str);
            return;
        }
        mo91084C();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo91079z(PaymentProviderConfiguration paymentProviderConfiguration) {
        boolean z;
        ArrayList arrayList = this.f90792n;
        if (arrayList == null) {
            mo91094v(paymentProviderConfiguration);
        } else {
            this.f90780j = C32315k0.m95273v(arrayList, paymentProviderConfiguration.getServiceConfigJson(), paymentProviderConfiguration.isHasDebt());
        }
        PaymentCustomConfiguration d = C38375b.m112708d(this.f90776f.f91743d, paymentProviderConfiguration, this.f90775e, this.f90780j, this.f90800v);
        this.f90775e = d;
        if (this.f90792n != null) {
            for (PaymentCustomParameter next : d.getParameters()) {
                if (!next.isMandatory()) {
                    if (this.f90775e.getResultListItems() == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    next.setVisibleInForm(z);
                }
            }
        }
        mo91075q();
        if (this.f90793o != -1) {
            this.f90775e.setSelectedPackageIndex(paymentProviderConfiguration.getServiceConfigJson(), this.f90793o);
        }
        this.f90801w = paymentProviderConfiguration;
        ArrayList arrayList2 = this.f90792n;
        if (arrayList2 != null) {
            this.f90780j = C32315k0.m95273v(arrayList2, paymentProviderConfiguration.getServiceConfigJson(), paymentProviderConfiguration.isHasDebt());
        }
        mo91109c0(true);
        mo91076r().mo79613J2(mo91074n());
    }
}
