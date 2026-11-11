package gregtech.api.recipe.maps;

import javax.annotation.ParametersAreNonnullByDefault;

import gregtech.api.recipe.BasicUIPropertiesBuilder;
import gregtech.api.recipe.NEIRecipePropertiesBuilder;
import gregtech.api.recipe.RecipeMapFrontend;
import gregtech.api.util.MethodsReturnNonnullByDefault;
import gregtech.nei.GTNEIDefaultHandler;
import gregtech.nei.NEIScrollArea;

/**
 * The item outputs of the single-block centrifuge scroll when a recipe has more than its nine output slots.
 */
@ParametersAreNonnullByDefault
@MethodsReturnNonnullByDefault
public class CentrifugeFrontend extends RecipeMapFrontend {

    private static final int OUTPUT_X = 106, OUTPUT_Y = 6, OUTPUT_COLUMNS = 3;

    public CentrifugeFrontend(BasicUIPropertiesBuilder uiPropertiesBuilder,
        NEIRecipePropertiesBuilder neiPropertiesBuilder) {
        super(uiPropertiesBuilder, neiPropertiesBuilder);
    }

    @Override
    public void prepareRecipe(GTNEIDefaultHandler.CachedDefaultRecipe neiCachedRecipe) {
        NEIScrollArea.scrollItemOutputs(
            neiCachedRecipe,
            OUTPUT_X,
            OUTPUT_Y,
            OUTPUT_COLUMNS,
            uiProperties.maxItemOutputs / OUTPUT_COLUMNS);
    }
}
