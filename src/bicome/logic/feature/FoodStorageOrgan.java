package bicome.logic.feature;
/**
 * Determines the number of extra food storage organs
 * Dominant: Four extra food storage organs (a total of 5)
 * Recessive: One extra food storage organ (a total of 2)
 * None: No extra food storage organs (a total of 1)
 * @author Ege Balcioglu
 * @version 23.4.2018
 */
import bicome.logic.genotype.Genotype;
public final class FoodStorageOrgan extends FeatureBase
{
   private static FoodStorageOrgan instance;
   
   private FoodStorageOrgan()
   { 
      super();
   }
   
   /**
    * Gets the instance of this class according to the singleton pattern
    * @return the instance of this class
    */
   public static FeatureBase getInstance()
   {
      if ( instance == null )
         instance = new FoodStorageOrgan();
      return instance;
   }
   
   @Override
   protected void setMultipliers()
   {
      this.dominantMultipliers.put( "nutrition_stockpiling", 1.80 );
      this.recessiveMultipliers.put( "nutrition_stockpiling", 1.55 );
      this.noneMultipliers.put( "nutrition_stockpiling", 0.9 );
      this.dominantMultipliers.put( "speed", 0.90 );
      this.recessiveMultipliers.put( "speed", 0.95 );
      this.dominantMultipliers.put( "flight_ease", 1.05 );
      this.recessiveMultipliers.put( "flight_ease", 1.02 );
   }
   
   @Override
   protected String getFeatureName( Genotype g )
   {
      StringBuffer result = new StringBuffer( "" );
      if ( g == Genotype.NONE )
         result.append( "No " );
      else if ( g == Genotype.RECESSIVE_HOMOZYGOTE )
         result.append( "One " );
      else
         result.append( "Four " );
      result.append( "Extra Food Storage Organs" );
      return result.toString();
   }
}
