package com.management.issuemanagement.entity;

import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Data
public class Issue extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ISSUE_SEQ")
    @SequenceGenerator(sequenceName = "issue_seq", name = "ISSUE_SEQ", allocationSize = 10)
    @Column(name = "issue_id")
    private Long id;

    @Column(name = "description", length = 100)
    private String description;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "detail", length = 1000)
    private String detail;

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assignee;

    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;

    @JoinColumn(name = "reporter_id")
    @OneToOne(optional = true, fetch = FetchType.LAZY)
    private User reporter;

    @Column(name = "priority_type")
    @Enumerated(EnumType.STRING)
    private PriorityType priorityType;

}
