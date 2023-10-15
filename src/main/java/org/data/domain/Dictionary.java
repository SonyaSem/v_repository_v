package org.data.domain;


import org.data.domain.homeWork2.BaseDocumentType;
import org.data.domain.position.Position;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dictionary {
    public static List<BaseDocumentType> identityDocuments() {
        List<BaseDocumentType> BaseDocumentTypes = Stream.of(
                        new BaseDocumentType("01", "Приказ о найме на работу сотрудника"),
                        new BaseDocumentType("02", "Приказ о переводе сотрудника"),
                        new BaseDocumentType("03", "Прирказ об увольнении сотрудника")
                )
                .collect(Collectors.toList());
        return BaseDocumentTypes;
    }

}
