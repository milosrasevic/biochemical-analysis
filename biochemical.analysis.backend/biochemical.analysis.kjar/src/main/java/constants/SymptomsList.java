package constants;

import java.util.ArrayList;
import java.util.Arrays;

public class SymptomsList {

    public SymptomsList() {
    }

    public static final String LOSS_OF_APPETITE = "lossOfAppetite";
    public static final String FATIGUE = "fatigue";
    public static final String SHORTNESS_OF_BREATH = "shortnessOfBreath";
    public static final String RAPID_HEART_RATE = "rapidHeartRate";
    public static final String IRREGULAR_HEART_RATE = "irregularHeartRate";
    public static final String EASY_BRUISING = "easyBruising";
    public static final String NOSE_BLEEDING = "noseBleeding";
    public static final String HEADACHE = "headache";
    public static final String FEVER = "fever";
    public static final String LOUD_SNORING = "loudSnoring";
    public static final String MORNING_HEADACHE = "morningHeadache";
    public static final String GASPING_FOR_AIR_DURING_SLEEP = "gaspingForAirDuringSleep";
    public static final String AWAKENING_WITH_DRY_MOUTH = "awakeningWithDryMouth";
    public static final String DIFFICULTY_STAYING_ASLEEP = "difficultyStayingAsleep";
    public static final String EXCESSIVE_DAYTIME_SLEEPINESS = "excessiveDaytimeSleepiness";
    public static final String DRY_COUGH = "dryCough";
    public static final String UNEXPLAINED_WEIGHT_LOSS = "unexplainedWeightLoss";
    public static final String ACHING_MUSCLES = "achingMuscles";
    public static final String ACHING_JOINTS = "achingJoints";
    public static final String SWOLLEN_LYMPH_NODES = "swollenLymphNodes";
    public static final String EASY_BLEEDING = "easyBleeding";
    public static final String TINY_RED_SPOTS_ON_SKIN = "tinyRedSpotsOnSkin";
    public static final String EXCESSIVE_SWEATING = "excessiveSweating";
    public static final String BONE_PAIN = "bonePain";
    public static final String FACE_RASH = "faceRash";
    public static final String CHEST_PAIN = "chestPain";
    public static final String DRY_EYES = "dryEyes";
    public static final String SWOLLEN_JOINTS = "swollenJoints";
    public static final String JOINTS_STIFFNESS = "jointsStiffness";
    public static final String NAUSEA = "nausea";
    public static final String SWELLING_LEGS = "swellingLegs";
    public static final String ITCHY_SKIN = "itchySkin";
    public static final String REDNESS_IN_PALMS = "rednessInPalms";
    public static final String VOMITING = "vomiting";
    public static final String MUSCLE_TWITCHES = "muscleTwitches";
    public static final String FREQUENT_URINATION = "frequentUrination";
    public static final String RAPID_WEIGHT_GAIN = "rapidWeightGain";
    public static final String SWELLING_ABDOMEN = "swellingAbdomen";
    public static final String BLOOD_IN_URINE = "bloodInUrine";
    public static final String BACK_PAIN = "backPain";
    public static final String UPPER_ABDOMINAL_PAIN = "upperAbdominalPain";
    public static final String WHITE_STOOL = "whiteStool";
    public static final String HOARSENESS = "hoarseness";
    public static final String COUGH = "cough";
    public static final String EYE_REDNESS = "eyeRedness";
    public static final String EYE_PAIN = "eyePain";
    public static final String EXCESS_TEARS = "excessTears";
    public static final String BLURRED_VISION = "blurredVision";
    public static final String LIGHT_SENSITIVITY = "lightSensitivity";
    public static final String DISCOLORED_PATCHES_OF_SKIN = "discoloredPatchesOfSkin";
    public static final String GROWTHS_ON_SKIN = "growthsOnSkin";
    public static final String THICK_SKIN = "thickSkin";
    public static final String DRY_SKIN = "drySkin";
    public static final String LOSS_OF_EYEBROWS = "lossOfEyebrows";
    public static final String LOSS_OF_EYELASHES = "lossOfEyelashes";
    public static final String LOSS_OF_HEIGHT = "lossOfHeight";
    public static final String STOOPED_POSTURE = "stoopedPosture";
    public static final String EASY_BONE_FRACTURES = "easyBoneFractures";
    public static final String MUSCLE_WEAKNESS = "muscleWeakness";
    public static final String HIPS_PAIN = "hipsPain";
    public static final String RIBS_PAIN = "ribsPain";
    public static final String DECREASED_MUSCLE_TONE = "decreasedMuscleTone";
    public static final String EXCESSIVE_BLEEDING = "excessiveBleeding";
    public static final String LARGE_BRUISES = "largeBruises";
    public static final String BLOOD_IN_STOOL = "bloodInStool";
    public static final String LOSS_OF_SEX_DRIVE = "lossOfSexDrive";
    public static final String IMPOTENCE = "impotence";
    public static final String MEMORY_FOG = "memoryFog";
    public static final String BLEEDING_GUMS = "bleedingGums";
    public static final String NUMBNESS_IN_EXTREMITIES = "numbnessInExtremities";
    public static final String TINGLING_IN_EXTREMITIES = "tinglingInExtremities";
    public static final String SWEATING_DURING_NIGHT = "sweatingDuringNight";
    public static final String FREQUENT_INFECTIONS = "frequentInfections";
    public static final String WATERY_DIARRHEA = "wateryDiarrhea";
    public static final String ABDOMINAL_PAIN = "abdominalPain";
    public static final String BLOATING = "bloating";
    public static final String EXCESSIVE_GAS = "excessiveGas";
    public static final String CHILLS = "chills";
    public static final String RASH = "rash";
    public static final String SORE_THROAT = "soreThroat";
    public static final String MOUTH_ULCERS = "mouthUlcers";
    public static final String DIARRHEA = "diarrhea";
    public static final String RUNNY_NOSE = "runnyNose";
    public static final String CONSTIPATION = "constipation";
    public static final String DIZZINESS = "dizziness";
    public static final String LEG_PAIN = "legPain";
    public static final String INCREASED_THIRST = "increasedThirst";
    public static final String EXTREME_HUNGER = "extremeHunger";
    public static final String STIFF_NECK = "stiffNeck";
    public static final String CONFUSION = "confusion";

    public static final ArrayList<String> aplasticAnemiaSymptoms = new ArrayList<String>(
            Arrays.asList(FATIGUE, SHORTNESS_OF_BREATH, RAPID_HEART_RATE, IRREGULAR_HEART_RATE,
                    EASY_BRUISING, NOSE_BLEEDING, HEADACHE, FEVER)
    );

    public static final ArrayList<String> sleepApneaSymptoms = new ArrayList<String>(
            Arrays.asList(LOUD_SNORING, MORNING_HEADACHE, GASPING_FOR_AIR_DURING_SLEEP, AWAKENING_WITH_DRY_MOUTH,
                    DIFFICULTY_STAYING_ASLEEP, EXCESSIVE_DAYTIME_SLEEPINESS)
    );

    public static final ArrayList<String> pulmonaryFibrosisSymptoms = new ArrayList<String>(
            Arrays.asList(SHORTNESS_OF_BREATH, DRY_COUGH, FATIGUE, UNEXPLAINED_WEIGHT_LOSS,
                    ACHING_MUSCLES, ACHING_JOINTS)
    );

    public static final ArrayList<String> leukemiaSymptoms = new ArrayList<String>(
            Arrays.asList(FEVER, FATIGUE, UNEXPLAINED_WEIGHT_LOSS, SWOLLEN_LYMPH_NODES, EASY_BRUISING,
                    EASY_BLEEDING, NOSE_BLEEDING, TINY_RED_SPOTS_ON_SKIN, EXCESSIVE_SWEATING,
                    BONE_PAIN)
    );

    public static final ArrayList<String> lupusSymptoms = new ArrayList<String>(
            Arrays.asList(FEVER, FATIGUE, ACHING_JOINTS, FACE_RASH, SHORTNESS_OF_BREATH, CHEST_PAIN, DRY_EYES,
                    HEADACHE)
    );

    public static final ArrayList<String> rheumatoidArthritisSymptoms = new ArrayList<String>(
            Arrays.asList(SWOLLEN_JOINTS, JOINTS_STIFFNESS, FATIGUE, FEVER, LOSS_OF_APPETITE)
    );

    public static final ArrayList<String> cirrhosisSymptoms = new ArrayList<String>(
            Arrays.asList(FATIGUE, EASY_BLEEDING, EASY_BRUISING, LOSS_OF_APPETITE, NAUSEA, SWELLING_LEGS,
                    UNEXPLAINED_WEIGHT_LOSS, ITCHY_SKIN, REDNESS_IN_PALMS)
    );

    public static final ArrayList<String> chronicKidneyFailureSymptoms = new ArrayList<String>(
            Arrays.asList(NAUSEA, VOMITING, LOSS_OF_APPETITE, FATIGUE, FREQUENT_URINATION, MUSCLE_TWITCHES,
                    SWELLING_LEGS, ITCHY_SKIN, CHEST_PAIN, SHORTNESS_OF_BREATH)
    );

    public static final ArrayList<String> heartFailureSymptoms = new ArrayList<String>(
            Arrays.asList(SHORTNESS_OF_BREATH, FATIGUE, SWELLING_LEGS, RAPID_HEART_RATE, IRREGULAR_HEART_RATE,
                    SWELLING_ABDOMEN, RAPID_WEIGHT_GAIN, LOSS_OF_APPETITE, NAUSEA, SHORTNESS_OF_BREATH,
                    CHEST_PAIN)
    );

    public static final ArrayList<String> kidneyCancerSymptoms = new ArrayList<String>(
            Arrays.asList(BLOOD_IN_URINE, BACK_PAIN, LOSS_OF_APPETITE, UNEXPLAINED_WEIGHT_LOSS,
                    FATIGUE, FEVER)
    );

    public static final ArrayList<String> liverCancerSymptoms = new ArrayList<String>(
            Arrays.asList(UNEXPLAINED_WEIGHT_LOSS, LOSS_OF_APPETITE, UPPER_ABDOMINAL_PAIN, NAUSEA,
                    VOMITING, FATIGUE, SWELLING_ABDOMEN, WHITE_STOOL)
    );

    public static final ArrayList<String> aorticAneurysmSymptoms = new ArrayList<String>(
            Arrays.asList(CHEST_PAIN, BACK_PAIN, HOARSENESS, COUGH, SHORTNESS_OF_BREATH)
    );

    public static final ArrayList<String> keratitisSymptoms = new ArrayList<String>(
            Arrays.asList(EYE_REDNESS, EYE_PAIN, EXCESS_TEARS, BLURRED_VISION, LIGHT_SENSITIVITY)
    );

    public static final ArrayList<String> hansensDiseaseSymptoms = new ArrayList<String>(
            Arrays.asList(DISCOLORED_PATCHES_OF_SKIN, GROWTHS_ON_SKIN, THICK_SKIN, DRY_SKIN,
                    LOSS_OF_EYEBROWS, LOSS_OF_EYELASHES)
    );

    public static final ArrayList<String> osteoporosisSymptoms = new ArrayList<String>(
            Arrays.asList(BACK_PAIN, LOSS_OF_HEIGHT, STOOPED_POSTURE, EASY_BONE_FRACTURES)
    );

    public static final ArrayList<String> osteomalaciaSymptoms = new ArrayList<String>(
            Arrays.asList(BACK_PAIN, BONE_PAIN, MUSCLE_WEAKNESS, HIPS_PAIN, RIBS_PAIN, DECREASED_MUSCLE_TONE)
    );

    public static final ArrayList<String> hemophiliaSymptoms = new ArrayList<String>(
            Arrays.asList(EXCESSIVE_BLEEDING, LARGE_BRUISES, SWOLLEN_JOINTS, ACHING_JOINTS, BLOOD_IN_URINE,
                    BLOOD_IN_STOOL, NOSE_BLEEDING)
    );

    public static final ArrayList<String> hemachromatosisSymptoms = new ArrayList<String>(
            Arrays.asList(ACHING_JOINTS, UPPER_ABDOMINAL_PAIN, FATIGUE, LOSS_OF_SEX_DRIVE, IMPOTENCE,
                    MEMORY_FOG)
    );

    public static final ArrayList<String> polycythemiaVeraSymptoms = new ArrayList<String>(
            Arrays.asList(ITCHY_SKIN, NUMBNESS_IN_EXTREMITIES, TINGLING_IN_EXTREMITIES, UPPER_ABDOMINAL_PAIN,
                    NOSE_BLEEDING, BLEEDING_GUMS, SWOLLEN_JOINTS, SHORTNESS_OF_BREATH)
    );

    public static final ArrayList<String> leukocytosisSymptoms = new ArrayList<String>(
            Arrays.asList(SWOLLEN_LYMPH_NODES, FATIGUE, FEVER, UPPER_ABDOMINAL_PAIN, SWEATING_DURING_NIGHT,
                    UNEXPLAINED_WEIGHT_LOSS, FREQUENT_INFECTIONS)
    );

    public static final ArrayList<String> blastocystisSymptoms = new ArrayList<String>(
            Arrays.asList(WATERY_DIARRHEA, NAUSEA, ABDOMINAL_PAIN, BLOATING, LOSS_OF_APPETITE, EXCESSIVE_GAS, FATIGUE)
    );

    public static final ArrayList<String> hivSymptoms = new ArrayList<String>(
            Arrays.asList(FEVER, CHILLS , RASH , SWEATING_DURING_NIGHT, ACHING_MUSCLES, SORE_THROAT, FATIGUE,
                    SWOLLEN_LYMPH_NODES, MOUTH_ULCERS)
    );

    public static final ArrayList<String> birdFluSymptoms = new ArrayList<String>(
            Arrays.asList(COUGH, DIARRHEA , SHORTNESS_OF_BREATH , FEVER, ACHING_MUSCLES, HEADACHE, SORE_THROAT,
                    RUNNY_NOSE)
    );

    public static final ArrayList<String> colonCancerSymptoms = new ArrayList<String>(
            Arrays.asList(CONSTIPATION, DIARRHEA , BLOOD_IN_STOOL , ABDOMINAL_PAIN, FATIGUE, UNEXPLAINED_WEIGHT_LOSS)
    );

    public static final ArrayList<String> lungCancerSymptoms = new ArrayList<String>(
            Arrays.asList(COUGH, SHORTNESS_OF_BREATH , CHEST_PAIN , HOARSENESS, UNEXPLAINED_WEIGHT_LOSS, BONE_PAIN,
                    HEADACHE)
    );

    public static final ArrayList<String> chikungunyaVirusSymptoms = new ArrayList<String>(
            Arrays.asList(FEVER, ACHING_JOINTS, HEADACHE, ACHING_MUSCLES, SWOLLEN_JOINTS, RASH)
    );

    public static final ArrayList<String> trenchFeverSymptoms = new ArrayList<String>(
            Arrays.asList(FEVER, FATIGUE, DIZZINESS, HEADACHE, BACK_PAIN, LEG_PAIN)
    );

    public static final ArrayList<String> varicellaSymptoms = new ArrayList<String>(
            Arrays.asList(FEVER, LOSS_OF_APPETITE, HEADACHE, FATIGUE)
    );

    public static final ArrayList<String> dengueSymptoms = new ArrayList<String>(
            Arrays.asList(NAUSEA, VOMITING, RASH, ACHING_MUSCLES, ACHING_JOINTS, BONE_PAIN)
    );

    public static final ArrayList<String> diabetesSymptoms = new ArrayList<String>(
            Arrays.asList(INCREASED_THIRST, FREQUENT_URINATION, EXTREME_HUNGER, UNEXPLAINED_WEIGHT_LOSS,
                    FATIGUE, BLURRED_VISION, FREQUENT_INFECTIONS)
    );

    public static final ArrayList<String> malariaSymptoms = new ArrayList<String>(
            Arrays.asList(FEVER, CHILLS, HEADACHE, NAUSEA, VOMITING, ACHING_MUSCLES, FATIGUE)
    );

    public static final ArrayList<String> meningitisSymptoms = new ArrayList<String>(
            Arrays.asList(FEVER, STIFF_NECK, HEADACHE, NAUSEA, VOMITING, CONFUSION, RASH, EXCESSIVE_DAYTIME_SLEEPINESS)
    );
}
