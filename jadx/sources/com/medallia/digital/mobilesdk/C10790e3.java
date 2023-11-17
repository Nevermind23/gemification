package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.MDExternalError;

/* renamed from: com.medallia.digital.mobilesdk.e3 */
class C10790e3 extends MedalliaDigitalError {

    /* renamed from: a */
    private final MDExternalError f30895a;

    protected C10790e3(int i, MDExternalError.ExternalError externalError, String str) {
        super(i, str);
        this.f30895a = externalError != null ? new MDExternalError(externalError) : null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MDExternalError mo28260a() {
        return this.f30895a;
    }
}
