CREATE TABLE IF NOT EXISTS public.branch_setup (
    bid bigserial NOT NULL,
    branch_ready_for_ops boolean,
    comments varchar,
    CONSTRAINT branch_setup_pkey PRIMARY KEY (bid)
);

CREATE TABLE IF NOT EXISTS public.resource_perosnal_details (
    resource_id bigserial NOT NULL,
    name varchar,
    designation varchar,
    contact_number bigint,
    br_fk int,
    CONSTRAINT resource_perosnal_details_pkey PRIMARY KEY (resource_id),
    foreign key (br_fk) references public.branch_setup(bid)
);


CREATE TABLE IF NOT EXISTS public.survey(
    survey_id bigserial NOT NULL,
    title varchar,
    bs_fk int,
    CONSTRAINT survey_pkey PRIMARY KEY(survey_id),
    foreign key(bs_fk) references public.branch_setup(bid));
    
CREATE TABLE IF NOT EXISTS public.particularrecords(
    pr_id bigserial NOT NULL,
    particular varchar,
    sp_fk int,
    CONSTRAINT particularrecords_pkey PRIMARY KEY(pr_id),
    foreign key(sp_fk) references public.survey(survey_id)
); 

CREATE TABLE IF NOT EXISTS public.records(
    r_id bigserial NOT NULL,
    particular varchar,
    value boolean,
    asset_id int,
    rp_fk int,
    CONSTRAINT records_pkey PRIMARY KEY(r_Id),
    foreign key(rp_fk) references public.particularrecords(pr_id)
); 