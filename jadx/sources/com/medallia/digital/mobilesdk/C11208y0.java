package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.y0 */
final class C11208y0 {

    /* renamed from: c */
    private static C11208y0 f32249c;

    /* renamed from: a */
    private ConfigurationContract f32250a;

    /* renamed from: b */
    private ConfigurationUUID f32251b;

    private C11208y0() {
    }

    /* renamed from: c */
    protected static C11208y0 m41106c() {
        if (f32249c == null) {
            f32249c = new C11208y0();
        }
        return f32249c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ConfigurationContract mo29204a() {
        return this.f32250a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ConfigurationUUID mo29208b() {
        return this.f32251b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29205a(ConfigurationContract configurationContract) {
        this.f32250a = configurationContract;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29206a(ConfigurationUUID configurationUUID) {
        this.f32251b = configurationUUID;
    }

    /* renamed from: a */
    public void mo29207a(PropertyConfigurationContract propertyConfigurationContract) {
        this.f32250a.propertyConfiguration = propertyConfigurationContract;
    }
}
