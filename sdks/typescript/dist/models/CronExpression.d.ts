export declare class CronExpression {
    'dayOfMonth': string;
    'dayOfWeek': string;
    'hour': string;
    'minute': string;
    'month': string;
    'second': string;
    static readonly discriminator: string | undefined;
    static readonly attributeTypeMap: Array<{
        name: string;
        baseName: string;
        type: string;
        format: string;
    }>;
    static getAttributeTypeMap(): {
        name: string;
        baseName: string;
        type: string;
        format: string;
    }[];
    constructor();
}
