package infra;

import java.util.Collection;

public final class UtilCollections {

    public static <T> boolean isVazia(final Collection<T> collection ) {

        return collection == null || collection.size() == 0;
    }

}
