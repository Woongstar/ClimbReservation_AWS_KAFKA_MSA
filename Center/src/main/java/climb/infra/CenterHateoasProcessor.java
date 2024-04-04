package climb.infra;

import climb.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class CenterHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Center>> {

    @Override
    public EntityModel<Center> process(EntityModel<Center> model) {
        return model;
    }
}
