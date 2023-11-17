package com.facetec.sdk;

public class FaceTecVocalGuidanceCustomization {
    public int facescanSuccessfulSoundFile = -1;
    public VocalGuidanceMode mode = VocalGuidanceMode.MINIMAL_VOCAL_GUIDANCE;
    public int pleaseFrameYourFaceInTheOvalSoundFile = -1;
    public int pleaseMoveCloserSoundFile = -1;
    public int pleasePressTheButtonToStartSoundFile = -1;
    public int pleaseRetrySoundFile = -1;
    public int uploadingSoundFile = -1;

    public enum VocalGuidanceMode {
        MINIMAL_VOCAL_GUIDANCE("MINIMAL_VOCAL_GUIDANCE"),
        FULL_VOCAL_GUIDANCE("FULL_VOCAL_GUIDANCE"),
        NO_VOCAL_GUIDANCE("NO_VOCAL_GUIDANCE");
        

        /* renamed from: a */
        private final String f8651a;

        private VocalGuidanceMode(String str) {
            this.f8651a = str;
        }

        public final String toString() {
            return this.f8651a;
        }
    }
}
