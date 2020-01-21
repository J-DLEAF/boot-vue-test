export default {
    User: [  // 유저DB
        {
            user_id: 1,
            name: 'Leeajin',
            created_at: '2019-05-19 12:24:11'
        },
        {
            user_id: 2,
            name: 'AJ',
            created_at: '2019-05-19 12:24:11'
        },
        {
            user_id: 3,
            name: 'b2connected',
            created_at: '2019-05-19 12:24:11'
        },
    ],
    Content: [  // 글 DB
        {
            content_id: 1,
            user_id: 1,
            title: '파피용',
            context: '재밌음',
            created_at: '2019-01-01 13:11:42',
            updated_at: null
        },
        {
            content_id: 2,
            user_id: 3,
            title: '황태자비 납치사건',
            context: '재밌음',
            created_at: '2019-01-02 14:11:42',
            updated_at: null
        },
        {
            content_id: 3,
            user_id: 2,
            title: '고구려',
            context: '재밌음',
            created_at: '2019-03-03 17:19:42',
            updated_at: null
        }
    ],
    Comment: [ // 댓글 DB
        {
            comment_id: 1,
            user_id: 1,
            content_id: 3,
            context: '재밌더라',
            created_at: '2019-03-29 13:11:11',
            updated_at: null
        },
        {
            comment_id: 2,
            user_id: 3,
            content_id: 3,
            context: '맞앙 재밌더라',
            created_at: '2019-03-29 13:11:11',
            updated_at: null
        },
        {
            comment_id: 3,
            user_id: 2,
            content_id: 1,
            context: '호오옹~ 진짜요?',
            created_at: '2019-03-29 13:11:11',
            updated_at: null
        }
    ],
    SubComment: [ // 대댓글 DB
        {
            subcomment_id: 1,
            comment_id: 3,
            user_id: 1,
            context: '넹 진짜 재밌음~',
            created_at: '2019-03-29 14:12:42',
            updated_at: null
        }
    ]
}