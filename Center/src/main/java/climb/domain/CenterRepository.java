package climb.domain;

import climb.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "centers", path = "centers")
public interface CenterRepository
    extends PagingAndSortingRepository<Center, Long> {}
