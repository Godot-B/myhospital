package umc.spring.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QPatient is a Querydsl query type for Patient
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPatient extends EntityPathBase<Patient> {

    private static final long serialVersionUID = 1980649689L;

    public static final QPatient patient = new QPatient("patient");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final EnumPath<Gender> gender = createEnum("gender", Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QPatient(String variable) {
        super(Patient.class, forVariable(variable));
    }

    public QPatient(Path<? extends Patient> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPatient(PathMetadata metadata) {
        super(Patient.class, metadata);
    }

}

