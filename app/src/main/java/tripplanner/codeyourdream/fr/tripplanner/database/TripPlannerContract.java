package tripplanner.codeyourdream.fr.tripplanner.database;

import android.provider.BaseColumns;

/**
 * Created by David on 31/10/2017.
 */

public final class TripPlannerContract {

    // This class cannot be instancied
    private TripPlannerContract() {};

    // Classe représentant la table voyage
    public static class VoyageEntry implements BaseColumns{
        public static final String TABLE_NAME = "voyage";
        public static final String COLUMN_NAME_NOM = "nom";
        public static final String COLUMN_NAME_STATUT = "statut";
    }

    // Classe représetant le table Stage / Etape
    public static class StageEntry implements BaseColumns{
        public static final String TABLE_NAME = "stage";
        public static final String COLUMN_NAME_VOYAGE = "voyage";
        public static final String COLUMN_NAME_NOM = "nom";
        public static final String COLUMN_NAME_LIEU_DEBUT = "lieuDebut";
        public static final String COLUMN_NAME_LIEU_ARRIVEE = "lieuArrivee";
        public static final String COLUMN_NAME_DUREE = "duree";
    }

    // Classe représentant la table PIEntry / Point d'intérêt
    public static class PIEntry implements BaseColumns {
        public static final String TABLE_NAME = "pi";
        public static final String COLUMN_NAME_STAGE = "stage";
        public static final String COLUMN_NAME_NOM = "nom";
        public static final String COLUMN_NAME_LIEU = "lieu";
        public static final String COLUMN_NAME_REMARQUE = "remarque";
        public static final String COLUMN_NAME_HEURE = "heure";
    }

    // Classe représentant la table info
    public static class InfoEntry implements BaseColumns {
        public static final String TABLE_NAME = "info";
        public static final String COLUMN_NAME_PI = "PIEntry";
        public static final String COLUMN_NAME_STAGE = "stage";
        public static final String COLUMN_NAME_NOM_CHAMP = "nomChamp";
        public static final String COLUMN_NAME_VALEUR_CHAMP= "valeurChamp";
        public static final String COLUMN_NAME_TYPE_CHAMP = "typeChamp";
    }


}
